package com.example.demo.models;

public class Original {

    private String url;

    public Original() {
    }

    public Original(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Original{" + "url='" + url + '\'' + '}';
    }

}
