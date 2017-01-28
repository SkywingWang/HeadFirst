package FactoryPattern;

/**
 * Created by SkywingWang on 17/1/28.
 */
public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza(){
        name = "NY Style Sauce and ClamPizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
