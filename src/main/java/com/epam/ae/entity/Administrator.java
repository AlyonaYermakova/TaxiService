package com.epam.ae.entity;

import java.util.List;
import java.util.UUID;

public class Administrator extends User {
    public Administrator(UUID uuid, String login, String password, String name, String surname, String email, Gender gender) {
        super(uuid, login, password, name, surname, email, gender);
    }

    public Administrator() {
    }

    public static class Builder {
        private UUID uuid;
        private String login;
        private String password;
        private String name;
        private String surname;
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

        public Administrator buildAdministrator() {
            return new Administrator(uuid, login, password, name, surname, email, gender);

        }

    }
}
