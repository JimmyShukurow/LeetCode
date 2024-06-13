package io.smartir.DesignPatterns.FactoryPattern.PizzaExample.Stores;

import io.smartir.DesignPatterns.FactoryPattern.PizzaExample.Ingredients.NYPizzaIngredientsFactory;
import io.smartir.DesignPatterns.FactoryPattern.PizzaExample.Ingredients.PizzaIngredientFactory;
import io.smartir.DesignPatterns.FactoryPattern.PizzaExample.Pizza;
import io.smartir.DesignPatterns.FactoryPattern.PizzaExample.PizzaStore;
import io.smartir.DesignPatterns.FactoryPattern.PizzaExample.Pizzas.CheesePizza;
import io.smartir.DesignPatterns.FactoryPattern.PizzaExample.Pizzas.ClamPizza;
import io.smartir.DesignPatterns.FactoryPattern.PizzaExample.Pizzas.PepperoniPizza;
import io.smartir.DesignPatterns.FactoryPattern.PizzaExample.Pizzas.VeggiePizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientsFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }
        return pizza;
    }
}
