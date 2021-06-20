package com.example.a15_18078591_tongsynguyen;

import java.io.Serializable;

public class Coffee implements Serializable {
    private int imagesCoffee;
    private String nameCoffee;
    private String priceCoffee;

    public Coffee(int imagesCoffee, String nameCoffee, String priceCoffee) {
        this.imagesCoffee = imagesCoffee;
        this.nameCoffee = nameCoffee;
        this.priceCoffee = priceCoffee;
    }

    public int getImagesCoffee() {
        return imagesCoffee;
    }

    public void setImagesCoffee(int imagesCoffee) {
        this.imagesCoffee = imagesCoffee;
    }

    public String getNameCoffee() {
        return nameCoffee;
    }

    public void setNameCoffee(String nameCoffee) {
        this.nameCoffee = nameCoffee;
    }

    public String getPriceCoffee() {
        return priceCoffee;
    }

    public void setPriceCoffee(String priceCoffee) {
        this.priceCoffee = priceCoffee;
    }
}
