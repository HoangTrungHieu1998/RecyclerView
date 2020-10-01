package com.example.recyclerview;

public class Movie {
    private String name;
    private Integer image;
    private String qualify;

    public Movie(String name, Integer image, String qualify) {
        this.name = name;
        this.image = image;
        this.qualify = qualify;
    }

    public String getName() {
        return name;
    }

    public Integer getImage() {
        return image;
    }

    public String getQualify() {
        return qualify;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public void setQualify(String qualify) {
        this.qualify = qualify;
    }
}
