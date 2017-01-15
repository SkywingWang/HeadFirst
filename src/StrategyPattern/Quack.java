package StrategyPattern;

/**
 * Created by SkywingWang on 17/1/9.
 */
public class Quack implements QuackBehavior {
    public void quack(){
        System.out.println("StrategyPattern.Quack");
    }
}
