package com.epam.ae.util;

import com.epam.ae.entity.*;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Runner {
    private static final Logger logger = LoggerFactory.getLogger(Runner.class);
//    private static List<Client> userList = new ArrayList<>();
    private static List<Order> orderList = new ArrayList<Order>();
    private static List<User> userList = new ArrayList<User>();

    public static void main(String[] args) {
//            Client user = new Client(new Client.Builder()
//                    .uuid(UUID.randomUUID())
//                    .login("1")
//                    .password("1")
//                    .name("NAME")
//                    .surname("SURNAME")
//                    .email("EMAIL")
//                    .gender(Gender.MALE)
//                    .address("S","H","F","P")
//            .buildClient());
//            userList.add(user);
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

        userList.add(client);
        userList.add(dispatcher);
        System.out.println(userList);


//


    }


}