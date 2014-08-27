package com.epam.ae.entity;

public enum Gender {
    MALE, FEMALE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
