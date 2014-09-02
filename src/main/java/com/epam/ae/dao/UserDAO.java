package com.epam.ae.dao;

import com.epam.ae.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserDAO {
    private final static String CLIENT = "client";
    private final static String DISPATCHER = "dispatcher";
    private static List<User> userList = new ArrayList<>();

    public User findByLoginPassword(String login, String password) {
        User foundUser = null;
        for (User user : userList) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                foundUser = user;
                break;
            }
        }
        return foundUser;
    }

    public User findByName(String name) {
        User foundUser = null;
        for (User user : userList) {
            if (user.getName().equals(name)) {
                foundUser = user;
                break;
            }
        }
        return foundUser;
    }

    public boolean addUser(String login, String password, String name, String surname, String role) {
        User auser = null;
        if (role.equals(CLIENT)) {
            auser = new Client.Builder()
                    .uuid(UUID.randomUUID())
                    .login(login)
                    .password(password)
                    .name(name)
                    .surname(surname)
                    .address("", "", "", "")
                    .email("noemail@taxi.com")
                    .gender(Gender.MALE)
                    .buildClient();
        } else if (role.equals(DISPATCHER)) {
            auser = new Dispatcher.Builder()
                    .uuid(UUID.randomUUID())
                    .login(login)
                    .password(password)
                    .name(name)
                    .surname(surname)
                    .email("noemail@taxi.com")
                    .gender(Gender.MALE)
                    .buildDispatcher();
        }
        return userList.add(auser);
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

        Administrator administrator = new Administrator.Builder()
                .uuid(UUID.randomUUID())
                .login("Admin")
                .password("admin")
                .name("Administrator")
                .surname("Adminovich")
                .email("admin@mail.com")
                .gender(Gender.MALE)
                .buildAdministrator();
        userList.add(administrator);
    }
}
