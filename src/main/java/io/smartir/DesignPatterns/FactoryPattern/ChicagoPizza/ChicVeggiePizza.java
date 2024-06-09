package io.smartir.DesignPatterns.FactoryPattern.ChicagoPizza;

import io.smartir.DesignPatterns.FactoryPattern.Pizza;

public class ChicVeggiePizza extends Pizza {
    public ChicVeggiePizza() {
        name = "ChicVeggiePizza";
        toppings.add("ChicKelogla");
    }
}
