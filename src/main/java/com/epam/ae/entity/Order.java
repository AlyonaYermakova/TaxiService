package com.epam.ae.entity;

public class Order {

    private Car car;
    private Client client;
    private String note;
    private String sum;

    public Order(Car car, Client client, String note, String sum) {
        this.car = car;
        this.client = client;
        this.note = note;
        this.sum = sum;
    }

    public Order() {
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Order{" +
                "car=" + car +
                ", client=" + client +
                ", note='" + note + '\'' +
                ", sum='" + sum + '\'' +
                '}';
    }
}
