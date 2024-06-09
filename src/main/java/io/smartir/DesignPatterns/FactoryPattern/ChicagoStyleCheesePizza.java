package io.smartir.DesignPatterns.FactoryPattern;


public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago style pizza";
        dough = "Extra thick pizza";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

   void cut() {
       System.out.println("Cutting the pizza into square slices");
    }
}
