package com.example.demo.models;

public class Rates {

    private Double RUB;

    public Rates() {
    }

    public Rates(Double RUB) {
        this.RUB = RUB;
    }

    public Double getRUB() {
        return RUB;
    }

    public void setRUB(Double RUB) {
        this.RUB = RUB;
    }

    @Override
    public String toString() {
        return "Rates{" + "RUB=" + RUB + '}';
    }

}
