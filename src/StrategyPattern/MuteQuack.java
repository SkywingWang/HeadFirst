package StrategyPattern;

/**
 * Created by SkywingWang on 17/1/9.
 */
public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("<<Silence>>");
    }
}
