package io.smartir.DesignPatterns.FactoryPattern.RestaurantExample.restaurants;

import io.smartir.DesignPatterns.FactoryPattern.RestaurantExample.Burgers.Burger;
import io.smartir.DesignPatterns.FactoryPattern.RestaurantExample.Burgers.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {

    @Override
    public Burger create() {
        return new VeggieBurger();
    }
}
