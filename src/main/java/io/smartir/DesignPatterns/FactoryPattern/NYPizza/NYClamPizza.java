package io.smartir.DesignPatterns.FactoryPattern.NYPizza;

import io.smartir.DesignPatterns.FactoryPattern.Pizza;

public class NYClamPizza extends Pizza {
    public NYClamPizza() {
        name = "NYCLamPizza";
        toppings.add("NYHam");
        toppings.add("NyMushroom");
    }
}
