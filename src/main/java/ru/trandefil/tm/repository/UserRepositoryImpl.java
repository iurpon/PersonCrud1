package ru.trandefil.tm.repository;

import ru.trandefil.tm.entity.User;
import ru.trandefil.tm.api.UserRepository;

import java.util.*;

public class UserRepositoryImpl implements UserRepository {

    private static Map<String, User> userMap = new HashMap<>();

    static {
        userMap.put("Admin",
                new User(UUID.randomUUID().toString(), "Admin", "33D87FD364516F6604124FCC76FDD279"));//adminPassword
        userMap.put("User",
                new User(UUID.randomUUID().toString(), "User", "221068207E125B97BEB4E2D062E888B1"));//userPassword
    }

    @Override
    public User delete(User user) {
        return deleteByName(user.getName());
    }

    @Override
    public User deleteByName(String name) {
        return userMap.remove(name);
    }

    @Override
    public User save(User user) {
        return userMap.put(user.getName(), user);
    }

    @Override
    public User getByName(String userName) {
        return userMap.get(userName);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public User getLoginUser(String userName, String userPassword) {
        return userMap.get(userName);
    }

}
