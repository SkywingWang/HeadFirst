package IteratorAndCompositePattern.IteratorPattern;

import java.util.Iterator;

/**
 * Created by SkywingWang on 17/2/12.
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;
    public Waitress(Menu pancakeHouseMenu,Menu dinerMenu,Menu cafeMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }
    public void printMenu(){
        java.util.Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        java.util.Iterator dinerIterator = dinerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
        System.out.println("\nDinner");
        printMenu(cafeIterator);
    }
    public void printMenu(java.util.Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + "," + menuItem.getPrice() + "--");
            System.out.println(menuItem.getDescription());
        }
    }
}
