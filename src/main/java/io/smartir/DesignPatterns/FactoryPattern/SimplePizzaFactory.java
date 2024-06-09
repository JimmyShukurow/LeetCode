package io.smartir.DesignPatterns.FactoryPattern;

import io.smartir.DesignPatterns.FactoryPattern.Pizzas.CheesePizza;
import io.smartir.DesignPatterns.FactoryPattern.Pizzas.ClamPizza;
import io.smartir.DesignPatterns.FactoryPattern.Pizzas.PepperoniPizza;

public class SimplePizzaFactory  {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        }
        return pizza;
    }

    protected void orderPizza() {

    }
}
