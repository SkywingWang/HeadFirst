package FactoryPattern;

/**
 * Created by SkywingWang on 17/1/28.
 */
public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza(){
        name = "Chicago";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded clam");
    }
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
