package ru.netology.domain;

import java.util.Objects;

public class Smartphone extends Product {
    private String brand;
    private String manufacturer;


    public Smartphone() {
    }

    public Smartphone(int id, String name, int price, String brand, String manufacturer) {
        super(id, name, price);
        this.brand = brand;
        this.manufacturer = manufacturer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone)) return false;
        if (!super.equals(o)) return false;
        Smartphone that = (Smartphone) o;
        return getBrand().equals(that.getBrand()) && getManufacturer().equals(that.getManufacturer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBrand(), getManufacturer());
    }
}