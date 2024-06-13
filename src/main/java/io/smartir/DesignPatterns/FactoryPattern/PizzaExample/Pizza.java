package io.smartir.DesignPatterns.FactoryPattern.PizzaExample;

import io.smartir.DesignPatterns.FactoryPattern.PizzaExample.Ingredients.*;

import java.util.Arrays;

public abstract class Pizza  {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies veggies[];
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clams;

    protected abstract void prepare();

    void bake() {
        System.out.println("bake pizza");
    }

    void cut() {
        System.out.println("cut pizza");
    }

    void box() {
        System.out.println("box pizza");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}
