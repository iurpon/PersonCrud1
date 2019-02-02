package ru.trandefil.tm.repository.inMemory;

import ru.trandefil.tm.entity.User;
import ru.trandefil.tm.repository.UserRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserRepositoryImpl implements UserRepository {
    private static Map<String,User> userMap = new HashMap<>();
    static {
        userMap.put("Admin",new User(UUID.randomUUID().toString(),"Admin","adminPassword"));
        userMap.put("User",new User(UUID.randomUUID().toString(),"User","userPassword"));
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
        return userMap.put(user.getName(),user);
    }

    @Override
    public User getByName(String userName) {
        return userMap.get(userName);
    }
}