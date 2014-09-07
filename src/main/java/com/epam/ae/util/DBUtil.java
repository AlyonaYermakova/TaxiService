package com.epam.ae.util;

public class DBUtil {

    public class TableUser {
        public static final String TABLE = "user";
        public static final String LOGIN = "login";
        public static final String PASSWORD = "password";
        public static final String NAME = "name";
        public static final String SURNAME = "surname";
        public static final String EMAIL = "email";
        public static final String ROLE = "role";
        public static final String ID = "id";
        public static final String ADDRESS = "address";
        public static final String GENDER = "gender";

        private TableUser() {
        }
    }

    public class TableCar {
        public static final String TABLE = "car";
        public static final String NUMBER = "number";
        public static final String COLOR = "color";
        public static final String BRAND = "brand";
        public static final String IS_FREE = "isFree";
        public static final String ID = "id";

        private TableCar() {
        }
    }

    public class TableOrders {
        public static final String TABLE = "orders";
        public static final String CAR = "car";
        public static final String CLIENT = "client";
        public static final String NOTE = "note";
        public static final String ID = "id";

        private TableOrders() {
        }
    }
}
