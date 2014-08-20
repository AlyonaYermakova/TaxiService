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
        return "Address{" +
                "street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", flat='" + flat + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

//    public Address(AddressBuilder addressBuilder) {
//        this.street = addressBuilder.street;
//        this.house = addressBuilder.house;
//        this.flat = addressBuilder.flat;
//        this.phoneNumber = addressBuilder.phoneNumber;
//    }

//    public static class AddressBuilder {
//        private String street;
//        private String house;
//        private String flat;
//        private String phoneNumber;
//
//        public AddressBuilder() {
//        }
//
//        public AddressBuilder street(String street) {
//            this.street = street;
//            return this;
//        }
//
//        public AddressBuilder house(String house) {
//            this.house = house;
//            return this;
//        }
//
//        public AddressBuilder flat(String flat) {
//            this.flat = flat;
//            return this;
//        }
//
//        public AddressBuilder phoneNumber(String phoneNumber) {
//            this.phoneNumber = phoneNumber;
//            return this;
//        }
//    }
}
