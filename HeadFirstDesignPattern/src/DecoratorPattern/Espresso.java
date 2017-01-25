package DecoratorPattern;

/**
 * Created by SkywingWang on 17/1/24.
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }
    public double cost(){
        return 1.99;
    }
}
