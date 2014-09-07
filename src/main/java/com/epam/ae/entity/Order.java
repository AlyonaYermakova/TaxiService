package com.epam.ae.entity;

public class Order {

    private Car car;
    private Client client;
    private String note;
    private String sum;
    private boolean isComplete = false;

    public Order(Car car, Client client, String note, String sum) {
        this.car = car;
        this.client = client;
        this.note = note;
        this.sum = sum;
    }

    public Order() {
    }

    public Order(Car car, Client client, String note) {
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
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

    public static class Builder {
        private Car car;
        private Client client;
        private String note;

        public Builder() {
        }

        public Builder car(String n, String c, String b) {
            this.car = new Car(n, c, b);
            return this;
        }

        public Builder client(Client client) {
            this.client = client;
            return this;
        }

        public Builder note(String note) {
            this.note = note;
            return this;
        }

        public Order buildOrder() {
            return new Order(car, client, note);
        }
    }
}
