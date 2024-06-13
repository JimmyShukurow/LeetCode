package io.smartir.DesignPatterns.FactoryPattern.RestaurantExample.restaurants;

import io.smartir.DesignPatterns.FactoryPattern.RestaurantExample.Burgers.Burger;

public abstract class Restaurant {
    public Burger orderBurger() {
        Burger burger = create();
        burger.prepare();
        return burger;
    }

    public abstract Burger create();
}
