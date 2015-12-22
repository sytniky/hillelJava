package org.hillel.lesson9;

/**
 * Created by yuriy on 22.12.15.
 */
public class Color {
    private String name;
    private double consumption;
    private double cost;

    public Color(String name, double consumption, double cost) {
        this.name = name;
        this.consumption = consumption;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                ", consumption=" + consumption +
                ", cost=" + cost +
                '}';
    }
}
