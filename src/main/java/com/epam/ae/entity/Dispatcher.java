package com.epam.ae.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Dispatcher extends User {
    private List<Order> orders;

    public Dispatcher(UUID uuid, String login, String password, String name, String surname, String email, Gender gender, List<Order> orders) {
        super(uuid, login, password, name, surname, email, gender);
        orders = new ArrayList<Order>();
    }

    public Dispatcher(List<Order> orders) {
        this.orders = orders;
    }

    public Dispatcher() {
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return super.toString() +
                "orders=" + orders;
    }

    public static class Builder {
        private UUID uuid;
        private String login;
        private String password;
        private String name;
        private String surname;
        private List<Order> orders;
        private String email;
        private Gender gender;

        public Builder() {
        }

        public Builder uuid(UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder login(String login) {
            this.login = login;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

//        public Builder orderList (List<Order> orders){
//            orders = new ArrayList<Order>();
//            return orderList(orders);
//        }


        public Dispatcher buildDispatcher() {
            return new Dispatcher(uuid, login, password, name, surname, email, gender, orders);

        }

    }
}
