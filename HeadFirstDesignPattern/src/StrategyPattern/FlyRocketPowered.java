package StrategyPattern;

/**
 * Created by SkywingWang on 17/1/9.
 */
public class FlyRocketPowered implements FlyBehavior {
    public void fly(){
        System.out.println("I'm flying with a rocket!");
    }
}
