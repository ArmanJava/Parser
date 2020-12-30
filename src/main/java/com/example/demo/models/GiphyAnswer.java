package com.example.demo.models;

public class GiphyAnswer {

    private Data data;

    public GiphyAnswer() {
    }

    public GiphyAnswer(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GiphyAnswer{" + "data=" + data + '}';
    }

}
