package com.example.demo.models;

public class Data {

    private Images images;

    public Data() {
    }

    public Data(Images images) {
        this.images = images;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Data{" + "images=" + images + '}';
    }

}
