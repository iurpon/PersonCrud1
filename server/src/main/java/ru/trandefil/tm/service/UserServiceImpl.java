package ru.trandefil.tm.service;

import lombok.NonNull;
import ru.trandefil.tm.api.UserRepository;
import ru.trandefil.tm.api.UserService;
import ru.trandefil.tm.entity.Role;
import ru.trandefil.tm.entity.Session;
import ru.trandefil.tm.entity.User;
import ru.trandefil.tm.util.EMFactoryUtil;
import ru.trandefil.tm.util.HashUtil;
import ru.trandefil.tm.util.SignatureUtil;
import ru.trandefil.tm.util.UUIDUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void delete(@NonNull User user) {
        EntityManager em = EMFactoryUtil.getEntityManager();
        em.getTransaction().begin();
        userRepository.delete(user, em);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void deleteByName(@NonNull String name) {
    }

    @Override
    public User save(@NonNull User user) {
        if (user.isNew()) {
            user.setId(UUIDUtil.getUniqueString());
        }
        EntityManager em = EMFactoryUtil.getEntityManager();
        em.getTransaction().begin();
        userRepository.saveOrUpdate(user, em);
        em.getTransaction().commit();
        em.close();
        return user;
    }

    @Override
    public User getByName(@NonNull String userName) {
        EntityManager em = EMFactoryUtil.getEntityManager();
        em.getTransaction().begin();
        User user = userRepository.findByName(userName, em);
        em.getTransaction().commit();
        em.close();
        return user;
    }

    @Override
    public List<User> getAll() {
        EntityManager em = EMFactoryUtil.getEntityManager();
        em.getTransaction().begin();
        List<User> users = userRepository.getAll(em);
        em.getTransaction().commit();
        em.close();
        return users;
    }

    @Override
    public Session getSession(@NonNull String userName, @NonNull String userPassword) {
        EntityManager em = EMFactoryUtil.getEntityManager();
        em.getTransaction().begin();
        User user = userRepository.getLogged(userName, HashUtil.hashPassword(userPassword), em);
        if (user == null) {
            System.out.println("bad login.");
            return null;
        }
        em.getTransaction().commit();
        em.close();
        System.out.println("logged " + user.getName());
        final Session newSess = createNewSession(user.getId(), user.getRole());
        return newSess;
    }

    private Session createNewSession(@NonNull final String userId, @NonNull final Role role) {
        final String uuid = UUIDUtil.getUniqueString();
        final long timeStamp = System.nanoTime();
        final String signature = SignatureUtil.createSignature(uuid, userId, timeStamp, role);
        final Session created = new Session(uuid, timeStamp, userId, role, signature);
        return created;
    }

    @Override
    public void logout(@NonNull String sessionId) {

    }

    @Override
    public User constractUser(@NonNull String name, @NonNull String pass, @NonNull String role) {
        User created = new User(null, name, pass, Enum.valueOf(Role.class,role));
        User saved = save(created);
        return saved;
    }
}
