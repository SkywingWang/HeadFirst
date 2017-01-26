package DecoratorPattern;

/**
 * Created by SkywingWang on 17/1/24.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;


    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        return 0.20 + beverage.cost();
    }
}
