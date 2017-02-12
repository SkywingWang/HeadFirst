package TemplatePattern;

/**
 * Created by SkywingWang on 17/2/10.
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater(){
        System.out.println("Boiling water");
    }
    void pourInCup(){
        System.out.println("Pouring into cup");
    }
}
