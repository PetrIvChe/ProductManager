package ru.netology.domain;

import java.util.Objects;

public class Smartphone {
    private String model;
    private String os;
    private int manufactureYear;

    public Smartphone() {
        super();
    }

    public Smartphone(int id, String name, int price, String model, String os, int manufactureYearYear) {
        super(id, name, price);
        this.model = model;
        this.os = os;
        this.manufactureYear = manufactureYearYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOs  () {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ru.netology.domain.Smartphone smartphone = (ru.netology.domain.Smartphone) o;
        return model == smartphone.model &&
                manufactureYear == smartphone.manufactureYear &&
                Objects.equals(model, smartphone.manufactureYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model, os, manufactureYear);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", os=" + os +
                ", manufactureYear=" + manufactureYear +
                '}';
    }
}
