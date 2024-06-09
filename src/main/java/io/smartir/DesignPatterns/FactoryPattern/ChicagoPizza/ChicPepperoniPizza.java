package io.smartir.DesignPatterns.FactoryPattern.ChicagoPizza;

import io.smartir.DesignPatterns.FactoryPattern.Pizza;

public class ChicPepperoniPizza extends Pizza {

    public ChicPepperoniPizza() {
        name = "ChicPepperoniPizza";
        toppings.add("ChicJimmiMushroom");
    }
}
