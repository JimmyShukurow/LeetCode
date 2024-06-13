package io.smartir.DesignPatterns.FactoryPattern.PizzaExample.Pizzas;

import io.smartir.DesignPatterns.FactoryPattern.PizzaExample.Ingredients.PizzaIngredientFactory;
import io.smartir.DesignPatterns.FactoryPattern.PizzaExample.Pizza;

public class PepperoniPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
