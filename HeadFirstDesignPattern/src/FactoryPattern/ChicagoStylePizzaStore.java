package FactoryPattern;

/**
 * Created by SkywingWang on 17/1/28.
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    Pizza pizza;
    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new ChicagoStylePepperoniPizza();
        }else if(type.equals("clam")){
            pizza = new ChicagoStyleClamPizza();
        }else if(type.equals("veggie")){
            pizza = new ChicagoStyleVeggiePizza();
        }else {
            pizza = new Pizza();
        }
        return pizza;
    }
}
