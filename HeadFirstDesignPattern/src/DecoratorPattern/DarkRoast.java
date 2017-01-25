package DecoratorPattern;

/**
 * Created by SkywingWang on 17/1/24.
 */
public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "Dark Roast";
    }
    public double cost(){
        return 0.99;
    }
}
