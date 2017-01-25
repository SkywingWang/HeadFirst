package DecoratorPattern;

/**
 * Created by SkywingWang on 17/1/24.
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend Coffee";
    }

    public double cost(){
        return 0.89;
    }
}
