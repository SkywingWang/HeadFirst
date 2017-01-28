package FactoryPattern;

/**
 * Created by SkywingWang on 17/1/28.
 */
public class NYStylePizzaStore extends PizzaStore {
    Pizza pizza;
    public Pizza createPizza(String type){

        if(type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new NYStylePepperoniPizza();
        }else if(type.equals("clam")){
            pizza = new NYStyleClamPizza();
        }else if(type.equals("veggie")){
            pizza = new NYStyleVeggiePizza();
        }else{
            pizza = new Pizza();
        }
        return pizza;
    }
}
