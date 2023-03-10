package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int toppings;
    private int cheese;
    // To check if cheese already added :
    boolean isCheeseAdded;
    // To check if extra topping already added :
    boolean isExtraToppingAdded;
    // To check if bill already created :
    boolean isBillCreated;
    boolean isTakeAway;

    // Cannot change the number of parameters :
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        // For Veg
        if(isVeg) {
            this.price = 300;
            this.toppings = 70;
        } else {
            // For Non-Veg
            this.price = 400;
            this.toppings = 120;
        }

        // Optional
        /*  this.isCheeseAdded = false;
            this.isExtraToppingAdded = false;
            this.isBillCreated = false;
            this.isTakeAway = false;
         */

        this.cheese = 80;
        // Initializing the Bill :
//        this.bill = "";
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded) {
            this.price += this.cheese;
            this.isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingAdded) {
            this.price += this.toppings;
            this.isExtraToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway) {
            this.price += 20;
            this.isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillCreated) {
            if(isCheeseAdded)
                this.bill += "Extra Cheese Added: " + this.cheese + "\n";
            if(isExtraToppingAdded)
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            if(isTakeAway)
                this.bill += "Paperbag Added: 20" + "\n";
            this.bill += "Total Price: " + this.price + "\n";
            this.isBillCreated = true;
        }
        return this.bill;
    }
}

