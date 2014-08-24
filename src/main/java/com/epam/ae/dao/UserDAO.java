package com.epam.ae.dao;

import com.epam.ae.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return userList;
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
