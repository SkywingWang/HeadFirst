package DecoratorPattern;

/**
 * Created by SkywingWang on 17/1/24.
 */
public abstract class Beverage {
    static final int TALL = 1;
    static final int GRANDE = 2;
    static final int VENTI = 3;

    String description = "Unknown Beverage";

//    public abstract int getSize();

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
