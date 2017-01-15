package StrategyPattern;

/**
 * Created by SkywingWang on 17/1/9.
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
