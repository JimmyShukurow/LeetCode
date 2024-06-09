package io.smartir.DesignPatterns.FactoryPattern.ChicagoPizza;

import io.smartir.DesignPatterns.FactoryPattern.Pizza;

public class ChicCheesePizza extends Pizza {
    public ChicCheesePizza() {
        name = "ChicCheesePizza";
        toppings.add("chicJimiHam");
    }
}
