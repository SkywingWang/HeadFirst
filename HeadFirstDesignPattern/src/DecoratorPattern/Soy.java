package DecoratorPattern;

/**
 * Created by SkywingWang on 17/1/24.
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Soy";
    }

    public double cost(){
        return 0.15 + beverage.cost();
    }
}
