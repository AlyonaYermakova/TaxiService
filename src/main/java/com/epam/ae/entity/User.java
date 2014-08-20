package com.epam.ae.entity;

import java.util.UUID;

public class User {
    private UUID uuid;
    private String login;
    private String password;
    private String name;
    private String surname;
    private Address address;
    private String email;
    private Role role;
    private Gender gender;

    public User() {
    }

    public User(UserBuilder userBuilder){
        this.uuid = userBuilder.uuid;
        this.login = userBuilder.login;
        this.password = userBuilder.password;
        this.name = userBuilder.name;
        this.surname = userBuilder.surname;
        this.address = userBuilder.address;
        this.email = userBuilder.email;
        this.role = userBuilder.role;
        this.gender = userBuilder.gender;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "User{" +
                "uuid=" + uuid +
                ", login=" + login + "\n"  +
                ", password=" + password + '\n' +
                ", name=" + name + '\n' +
                ", surname=" + surname + '\n' +
                ", address:" + address +'\n' +
                ", email=" + email + '\n' +
                ", role=" + role +
                ", gender=" + gender +
                '}';
    }

    public enum Role {
        ADMIN, CLIENT, DISPATCHER;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    public enum Gender {
        MALE, FEMALE;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    public static class UserBuilder{
        private UUID uuid;
        private String login;
        private String password;
        private String name;
        private String surname;
        private Address address;
        private String email;
        private Role role;
        private Gender gender;

        public UserBuilder(){}

        public UserBuilder uuid (UUID uuid){
            this.uuid = uuid;
            return this;
        }

        public UserBuilder login (String login) {
            this.login = login;
            return this;
        }

        public UserBuilder password (String password) {
            this.password = password;
            return this;
        }

        public UserBuilder name (String name) {
            this.name = name;
            return this;
        }

        public UserBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public UserBuilder address(Address address) {
            this.address = new Address("","","","");
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder role(Role role) {
            this.role = role;
            return this;
        }

        public UserBuilder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public UserBuilder address(String s, String h, String f, String p) {
            this.address = new Address(s,h,f,p);
            return this;
        }
    }

}
