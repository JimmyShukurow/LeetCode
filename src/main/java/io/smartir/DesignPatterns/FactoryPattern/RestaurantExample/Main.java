package io.smartir.DesignPatterns.FactoryPattern.RestaurantExample;

import io.smartir.DesignPatterns.FactoryPattern.RestaurantExample.restaurants.BeefBurgerRestaurant;
import io.smartir.DesignPatterns.FactoryPattern.RestaurantExample.restaurants.Restaurant;
import io.smartir.DesignPatterns.FactoryPattern.RestaurantExample.restaurants.VeggieBurgerRestaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant beefRestaurant = new BeefBurgerRestaurant();
        beefRestaurant.orderBurger();
        Restaurant veggieRestaurant = new VeggieBurgerRestaurant();
        veggieRestaurant.orderBurger();
    }

}
