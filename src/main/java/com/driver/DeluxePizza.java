package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        // To call Pizza Class Constructor :
        super(isVeg);
        // your code goes here
        super.addExtraCheese();
        super.addExtraToppings();
    }
}
