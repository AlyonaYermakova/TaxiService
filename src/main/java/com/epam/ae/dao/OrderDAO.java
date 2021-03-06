package com.epam.ae.dao;

import com.epam.ae.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderDAO {
    private static List<Order> orders = new ArrayList<>();

    public static List<Order> getOrders() {
        return orders;
    }

    public boolean addOrder(String carType, Client client, String note) {
        Order order = null;
        order = new Order.Builder()
                .car("", "", "")
                .client(client)
                .note(note)
                .buildOrder();
 //       order.getCar().setIsFree(false);  //Do not work with it :(
        return orders.add(order);
    }
    public Order findOrder(User user) {
        Order foundOrder = null;
        for (Order order : orders) {
            if (order.getClient().equals(user)) {
                foundOrder = order;
                break;
            }
        }
        return foundOrder;
    }
    public void completeOrder(Order order) {
        order.setComplete(true);
        Car car = order.getCar();
        car.setIsFree(true);
    }

    //TODO find free car
    static {
        Client anyClient = new Client.Builder()
                .uuid(UUID.randomUUID())
                .login("1")
                .password("1")
                .name("Alyona")
                .surname("Erm")
                .address("Alih", "36/2", "12", "1-1-1-1")
                .email("a@gmail.com")
                .gender(Gender.FEMALE)
                .buildClient();
        Order order = new Order.Builder()
                .client(anyClient)
                .car("355evm", "red", "bmw")
                .note("empty")
                .buildOrder();
    }

}
