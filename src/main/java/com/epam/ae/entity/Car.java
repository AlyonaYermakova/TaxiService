package com.epam.ae.entity;

public class Car {

    private String number;
    private String color;
    private String brand;
    private CarType carType;
    private Boolean isFree = true;

    public Car(String number, String color, String brand) {
        this.number = number;
        this.color = color;
        this.brand = brand;

    }

    public Car() {
    }

    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", carType=" + carType +
                '}';
    }
}

