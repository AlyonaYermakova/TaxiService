package com.epam.ae.entity;

import java.util.UUID;

public abstract class User {
    private UUID uuid;
    private String login;
    private String password;
    private String name;
    private String surname;
    private String email;
    private Gender gender;

    public User(UUID uuid, String login, String password, String name, String surname, String email, Gender gender) {
        this.uuid = uuid;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = gender;
    }

    public User() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "uuid:" + uuid + '\n' +
                "login:" + login + '\n' +
                "password:" + password + '\n' +
                "name:" + name + '\n' +
                "surname:" + surname + '\n' +
                "email:" + email + '\n' +
                "gender:" + gender + '\n';
    }
}
