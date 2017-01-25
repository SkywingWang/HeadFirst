package DecoratorPattern;

/**
 * Created by SkywingWang on 17/1/24.
 */
public class Decat extends Beverage {
    public Decat(){
        description = "Decat";
    }
    public double cost(){
        return 1.05;
    }
}
