package FactoryPattern;

/**
 * Created by SkywingWang on 17/1/28.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name = "NY Style Sauce and CheesePizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
