package FactoryPattern;

/**
 * Created by SkywingWang on 17/1/28.
 */
public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza(){
        name = "NY Style Sauce and PepperoniPizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
