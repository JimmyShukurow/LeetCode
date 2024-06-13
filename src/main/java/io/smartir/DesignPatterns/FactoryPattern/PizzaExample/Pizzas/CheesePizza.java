package io.smartir.DesignPatterns.FactoryPattern.PizzaExample.Pizzas;

import io.smartir.DesignPatterns.FactoryPattern.PizzaExample.Ingredients.PizzaIngredientFactory;
import io.smartir.DesignPatterns.FactoryPattern.PizzaExample.Pizza;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}


