package TemplatePattern;

/**
 * Created by SkywingWang on 17/2/10.
 */
//public class Tea {
//    void prepareRecipe(){
//        boilWater();
//        steepTeaBag();
//        addLemon();
//        pourInCup();
//    }
//    public void boilWater(){
//        System.out.println("Boiling water");
//    }
//    public void steepTeaBag(){
//        System.out.println("Steeping the tea");
//    }
//    public void addLemon(){
//        System.out.println("Adding Lemon");
//    }
//    public void pourInCup(){
//        System.out.println("Pouring into cup");
//    }
//}
public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
