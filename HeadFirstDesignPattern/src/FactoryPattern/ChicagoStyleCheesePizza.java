package FactoryPattern;

import FactoryPattern.Pizza;

/**
 * Created by SkywingWang on 17/1/28.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chicago";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");

    }
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
