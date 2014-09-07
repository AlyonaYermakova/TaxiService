package com.epam.ae.dao;

import com.epam.ae.entity.User;

import java.util.List;

public interface UserDao {

    boolean addClient(String login, String password, String name, String surname, String street,
                      String house, String flat, String phoneNumber, String email) throws DaoException;

    User findByLoginPassword(String login, String password) throws DaoException;

    List<User> getUserList() throws DaoException;
}
