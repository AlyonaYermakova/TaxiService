package com.epam.ae.entity;

public class Address {
    private String street;
    private String house;
    private String flat;
    private String phoneNumber;

    public Address(String street, String house, String flat, String phoneNumber) {
        this.street = street;
        this.house = house;
        this.flat = flat;
        this.phoneNumber = phoneNumber;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return street + " " + house + " " + flat + " " + phoneNumber;
    }
}
