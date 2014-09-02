package com.epam.ae.entity;

public enum CarType {
    ECONOMY, COMFORT, PREMIUM;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
