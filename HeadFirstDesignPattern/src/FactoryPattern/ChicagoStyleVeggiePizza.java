package FactoryPattern;

/**
 * Created by SkywingWang on 17/1/28.
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza(){
        name = "Chicago";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Veggie");
    }
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
