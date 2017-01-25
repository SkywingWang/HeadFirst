package DecoratorPattern;

/**
 * Created by SkywingWang on 17/1/24.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
