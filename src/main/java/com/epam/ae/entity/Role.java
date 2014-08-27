package com.epam.ae.entity;

public enum Role {
    ADMIN, CLIENT, DISPATCHER;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
