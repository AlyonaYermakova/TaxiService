package com.epam.ae.util;

import com.epam.ae.dao.TestUserDAO;
import com.epam.ae.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Runner {
    private static final Logger logger = LoggerFactory.getLogger(Runner.class);
    private static List<Order> orderList = new ArrayList<Order>();
    private static List<User> userList = new ArrayList<User>();

    public static void main(String[] args) {

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

        Order order = new Order(new Car("12", "red", "mers"), client, "note", "300");
        orderList.add(order);

        Dispatcher dispatcher = new Dispatcher.Builder()
                .uuid(UUID.randomUUID())
                .login("disp1")
                .password("pass")
                .name("YYY")
                .surname("XXX")
                .email("dgfdgdgd")
                .gender(Gender.MALE)
                        //       .orders(orderList)
                .buildDispatcher();
        //   System.out.println(dispatcher);

//        UserDAO.addClient("666", "666", "666", "666", "666");
        //     UserDAO userDAO = new UserDAO();
        Role role;
        role = Role.CLIENT;
//        System.out.println(role);

        TestUserDAO userDAO = new TestUserDAO();
        userDAO.addUser("123", "123", "123", "123", role.toString());
//        System.out.println(userDAO.getUserList());

        Address ad = userDAO.getClientAddress(client);
        System.out.println(ad);
//


    }


}