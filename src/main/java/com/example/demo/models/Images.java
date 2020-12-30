package com.example.demo.models;

public class Images {

    private Original original;

    public Images() {
    }

    public Images(Original original) {
        this.original = original;
    }

    public Original getOriginal() {
        return original;
    }

    public void setOriginal(Original original) {
        this.original = original;
    }

    @Override
    public String toString() {
        return "Images{" + "original=" + original + '}';
    }

}
