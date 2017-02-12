package TemplatePattern;

/**
 * Created by SkywingWang on 17/2/10.
 */
//public class Coffee {
//    void prepareRecipe(){
//        boilWater();
//        brewCoffeeGrinds();
//        pourInCup();
//        addSugarAndMilk();
//    }
//    public void boilWater(){
//        System.out.println("Boiling water");
//    }
//    public void brewCoffeeGrinds(){
//        System.out.println("Dripping Coffee through filter");
//    }
//    public void pourInCup(){
//        System.out.println("Pouring into cup");
//    }
//    public void addSugarAndMilk(){
//        System.out.println("Adding Sugar and Mild");
//    }
//}

public class Coffee extends CaffeineBeverage{
    public void brew(){
        System.out.println("Dripping Coffee through filter");
    }
    public void addCondiments(){
        System.out.println("Adding Sugar and Milk");
    }
}
