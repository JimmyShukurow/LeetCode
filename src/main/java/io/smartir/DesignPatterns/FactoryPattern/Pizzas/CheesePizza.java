package io.smartir.DesignPatterns.FactoryPattern.Pizzas;

import io.smartir.DesignPatterns.FactoryPattern.Pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "CheesePizza";
        toppings.add("Mushroom");
    }
}


