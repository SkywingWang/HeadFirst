package IteratorAndCompositePattern.CompositePattern;


/**
 * Created by SkywingWang on 17/2/12.
 */
public class MenuTestDrive {
    public static void main(String args[]){
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU","Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU","Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course!");
        MenuComponent allMenus = new Menu("All MENUS","All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(cafeMenu);
        dessertMenu.add(new MenuItem("Apple Pie","Apple pie with a flakey crust,topped with vanilla ice cream",true,1.59));
        allMenus.add(dessertMenu);
        allMenus.add(dinerMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }
}
