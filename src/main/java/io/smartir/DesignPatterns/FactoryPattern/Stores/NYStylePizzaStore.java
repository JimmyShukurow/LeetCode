package io.smartir.DesignPatterns.FactoryPattern.Stores;

import io.smartir.DesignPatterns.FactoryPattern.NYPizza.NYCheesePizza;
import io.smartir.DesignPatterns.FactoryPattern.NYPizza.NYClamPizza;
import io.smartir.DesignPatterns.FactoryPattern.NYPizza.NYVeggiePizza;
import io.smartir.DesignPatterns.FactoryPattern.Pizza;
import io.smartir.DesignPatterns.FactoryPattern.PizzaStore;
import io.smartir.DesignPatterns.FactoryPattern.Pizzas.PepperoniPizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYVeggiePizza();
        }
        return pizza;
    }
}
