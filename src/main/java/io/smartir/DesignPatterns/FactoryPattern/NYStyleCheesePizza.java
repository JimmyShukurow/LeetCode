package io.smartir.DesignPatterns.FactoryPattern;
import io.smartir.DesignPatterns.FactoryPattern.NYPizza.NYCheesePizza;
import io.smartir.DesignPatterns.FactoryPattern.NYPizza.NYPepperoniPizza;

public class NYStyleCheesePizza  {


    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYPepperoniPizza();
        }
        return pizza;
    }

    protected void orderPizza() {

    }
}
