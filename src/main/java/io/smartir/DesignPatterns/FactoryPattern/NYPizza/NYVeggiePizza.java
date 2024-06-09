package io.smartir.DesignPatterns.FactoryPattern.NYPizza;

import io.smartir.DesignPatterns.FactoryPattern.Pizza;

public class NYVeggiePizza extends Pizza {
    public NYVeggiePizza() {
        name = "NYVeggiePizza";
        toppings.add("NYHam");
    }
}
