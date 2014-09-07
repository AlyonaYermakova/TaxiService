package com.epam.ae.dao;

import com.epam.ae.entity.*;
import java.util.*;
import static com.epam.ae.util.DBUtil.TableUser.*;
public class H2UserDao implements UserDao {

    private static List<User> userList = new ArrayList<>();

    public static final String FIND_BY_LOGIN_PASSWORD ="SELECT * FROM " + TABLE + " WHERE " + LOGIN + "=? AND " + PASSWORD + "=?";


    @Override
    public boolean addClient(String login, String password, String name, String surname, String street, String house,
                             String flat, String phoneNumber, String email) throws DaoException {
        User newUser = null;
        newUser = new Client.Builder()
                .uuid(UUID.randomUUID())
                .login(login)
                .password(password)
                .name(name)
                .surname(surname)
                .address(street, house, flat, phoneNumber)
                .email(email)
                .gender(Gender.MALE)
                .buildClient();
        return userList.add(newUser);
    }
    @Override
    public User findByLoginPassword(String login, String password) throws DaoException {
        User foundUser = null;
        for (User user : userList) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                foundUser = user;
                break;
            }
        }
        return foundUser;
    }

    @Override
    public List<User> getUserList() throws DaoException {
        return userList;
    }
}
