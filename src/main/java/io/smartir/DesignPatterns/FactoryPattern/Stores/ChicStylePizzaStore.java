package io.smartir.DesignPatterns.FactoryPattern.Stores;

import io.smartir.DesignPatterns.FactoryPattern.ChicagoPizza.ChicCheesePizza;
import io.smartir.DesignPatterns.FactoryPattern.ChicagoPizza.ChicClamPizza;
import io.smartir.DesignPatterns.FactoryPattern.ChicagoPizza.ChicPepperoniPizza;
import io.smartir.DesignPatterns.FactoryPattern.ChicagoPizza.ChicVeggiePizza;
import io.smartir.DesignPatterns.FactoryPattern.Pizza;
import io.smartir.DesignPatterns.FactoryPattern.PizzaStore;

public class ChicStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicPepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicVeggiePizza();
        }
        return pizza;
    }
}
