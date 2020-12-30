package com.example.demo.models;

public class OpenexchangeratesAnswer {

    private Rates rates;

    public OpenexchangeratesAnswer() {
    }

    public OpenexchangeratesAnswer(Rates rates) {
        this.rates = rates;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "Answer{" + "rates=" + rates + '}';
    }

}
