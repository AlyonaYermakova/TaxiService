package com.epam.ae.dao;

import com.epam.ae.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserDAO {
    private static List<Client> userList = new ArrayList<>();

    public static Client findByLoginPassword(String login, String password) {
        Client foundUser = null;
        for (Client user : userList) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password))
                foundUser = user;
        }
        return foundUser;
    }

    public List<Client> getUserList() {
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
    }
}
