package StrategyPattern;

/**
 * Created by SkywingWang on 17/1/9.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly(){
        System.out.println("I can't fly");
    }
}
