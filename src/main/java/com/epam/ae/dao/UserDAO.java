package com.epam.ae.dao;

import com.epam.ae.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return userList;
    }

    public User findByLogin(String login){
        User foundUser = null;
        for (User user : userList) {
           if (user.getLogin()==login)
                foundUser = user;
        }
        return foundUser;
    }
}
