package io.smartir.DesignPatterns.FactoryPattern.RestaurantExample.restaurants;

import io.smartir.DesignPatterns.FactoryPattern.RestaurantExample.Burgers.BeefBurger;
import io.smartir.DesignPatterns.FactoryPattern.RestaurantExample.Burgers.Burger;

public class BeefBurgerRestaurant extends Restaurant {

    @Override
    public Burger create() {
        return new BeefBurger();
    }
}
