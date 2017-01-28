package FactoryPattern;

/**
 * Created by SkywingWang on 17/1/28.
 */
public class ChicagoStylePepperoniPizza extends Pizza{
    public ChicagoStylePepperoniPizza(){
        name = "Chicago";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Pepperoni");

    }

    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
