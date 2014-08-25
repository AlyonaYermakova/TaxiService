package com.epam.ae.dao;

import com.epam.ae.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserDAO {
    private static List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return userList;
    }

    static {
       User user = new User(new User.UserBuilder()
                .uuid(UUID.randomUUID())
                .login("1")
                .password("1")
                .name("NAME")
                .surname("SURNAME")
                .email("EMAIL")
                .role(User.Role.ADMIN)
                .gender(User.Gender.MALE)
                .address("S","H","F","P"));
        userList.add(user);
    }

    public static User findByLoginPassword(String login, String password){
        User foundUser = null;
        for (User user : userList) {
           if (user.getLogin().equals(login) && user.getPassword().equals(password))
                foundUser = user;
        }
        return foundUser;
    }
}
