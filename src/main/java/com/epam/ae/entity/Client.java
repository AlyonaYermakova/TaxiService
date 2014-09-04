package com.epam.ae.entity;

import java.util.UUID;

public class Client extends User {
    private Address address;

    public Client(UUID uuid, String login, String password, String name, String surname, String email, Gender gender, Address address) {
        super(uuid, login, password, name, surname, email, gender);
        this.address = address;
    }

    public Client() {
    }

    @Override
    public String toString() {
        return super.toString() +
                "address:" + address;
    }

    public Address getAddress() {
        return address;
    }

    public static class Builder {
        private UUID uuid;
        private String login;
        private String password;
        private String name;
        private String surname;
        private Address address;
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

        public Builder address(String s, String h, String f, String p) {
            this.address = new Address(s, h, f, p);
            return this;
        }

        public Client buildClient() {
            return new Client(uuid, login, password, name, surname, email, gender, address);

        }

    }

}
