package FactoryPattern;

/**
 * Created by SkywingWang on 17/1/28.
 */
public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza(){
        name = "NY Style Sauce and VeggiePizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
