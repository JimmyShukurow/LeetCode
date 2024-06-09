package io.smartir.DesignPatterns.FactoryPattern;

import io.smartir.DesignPatterns.FactoryPattern.Stores.ChicStylePizzaStore;
import io.smartir.DesignPatterns.FactoryPattern.Stores.NYStylePizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        nyStylePizzaStore.orderPizza("cheese");
        PizzaStore chicStylePizzaStore = new ChicStylePizzaStore();
        chicStylePizzaStore.orderPizza("pepperoni");
    }
}
