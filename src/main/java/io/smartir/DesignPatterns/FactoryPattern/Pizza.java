package io.smartir.DesignPatterns.FactoryPattern;

import io.smartir.DesignPatterns.FactoryPattern.Pizzas.CheesePizza;
import io.smartir.DesignPatterns.FactoryPattern.Pizzas.PepperoniPizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class Pizza extends SimplePizzaFactory {
    public String name;
    public String dough;
    public String sauce;
    public List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough ");
        System.out.println("Adding sauce");
        System.out.println("Adding toppings:");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }

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
}
