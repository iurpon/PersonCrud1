package ru.trandefil.tm.endpoint;

import org.hibernate.exception.ConstraintViolationException;
import org.junit.Test;
import ru.trandefil.tm.entity.Role;
import ru.trandefil.tm.entity.Session;
import ru.trandefil.tm.entity.User;
import ru.trandefil.tm.exception.DataBaseException;
import ru.trandefil.tm.util.EMFactoryUtil;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static ru.trandefil.tm.TestData.ADMIN;
import static ru.trandefil.tm.TestData.USER;

public class UserEndPointImplTest extends AbstractEndPoint {

/*
    @Test
    public void deleteUserByName() {
        User newUser = new User(null, "newUser", "newPass", Role.USER);
        User saved = userService.save(newUser);
        List<User> list = userService.getAll();
        assertEquals(list.size(), 3);
        userService.deleteByName("newUser");
        list = userService.getAll();
        assertEquals(list.size(), 2);
    }

    @Test
    public void saveUser() {
        User newUser = new User(null, "newUser", "newPass", Role.USER);
        User saved = userService.save(newUser);
        newUser.setId(saved.getId());
        assertEquals(newUser, saved);
    }

    @Test(expected = DataBaseException.class)
    public void saveDuplicate(){
        User newUser = new User(null, "newUser", "newPass", Role.USER);
        userService.save(newUser);
        User newUser1 = new User(null, "newUser", "newPass", Role.USER);
        userService.save(newUser1);
    }

    @Test
    public void getUserByName() {
        User user = userService.getByName("Admin");
        assertEquals(user, ADMIN);
    }

    @Test
    public void getAllUsers() {
        List<User> userList = userService.getAll();
        assertEquals(userList.size(), 2);
    }

    @Test
    public void getSession() {
        Session session = userService.getSession("Admin", "adminPassword");
        assertEquals(session != null, true);
    }

    @Test
    public void userLogout() {
        Session session = userService.getSession("Admin", "adminPassword");
        userService.logout(session);
        assertEquals(sessionRepository.getAll(EMFactoryUtil.getEntityManager()).size(),0);
    }

    @Test
    public void updateUser() {
        User user = new User(USER);
        user.setName("Update");
        User saved = userService.save(user);
        assertEquals(saved,user);
    }

    @Test
    public void registry() {
    }
*/

}