package com.epam.ae.dao;

import com.epam.ae.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserDAO {
    private static List<User> userList = new ArrayList<>();

    public static User findByLoginPassword(String login, String password) {
        User foundUser = null;
        for (User user : userList) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password))
                foundUser = user;
            break;
        }
        return foundUser;
    }

    public List<User> getUserList() {
        return userList;
    }

    static {
        Client client = new Client.Builder()
                .uuid(UUID.randomUUID())
                .login("1")
                .password("1")
                .name("Alyona")
                .surname("Erm")
                .address("Alih", "36/2", "12", "1-1-1-1")
                .email("a@gmail.com")
                .gender(Gender.FEMALE)
                .buildClient();
        userList.add(client);

        Dispatcher dispatcher = new Dispatcher.Builder()
                .uuid(UUID.randomUUID())
                .login("disp1")
                .password("pass")
                .name("YYY")
                .surname("XXX")
                .email("xfdgthjkg")
                .gender(Gender.MALE)
                        //       .orders(orderList)
                .buildDispatcher();

        userList.add(dispatcher);
    }
}
