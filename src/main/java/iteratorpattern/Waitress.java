package iteratorpattern;

import java.util.List;

public class Waitress {
    public void printMenu() {
        BreakfastMenu breakfastMenu = new BreakfastMenu();
        List<MenuItem> breakfastMenus = breakfastMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] dinerMenus = dinerMenu.getMenuItems();

        for (MenuItem menu : breakfastMenus) {
            System.out.println("menu.getName() = " + menu.getName());
            System.out.println("menu.getDescription() = " + menu.getDescription());
            System.out.println("menu.getPrice() = " + menu.getPrice());
        }

        for (MenuItem menu : dinerMenus) {
            System.out.println("menu.getName() = " + menu.getName());
            System.out.println("menu.getDescription() = " + menu.getDescription());
            System.out.println("menu.getPrice() = " + menu.getPrice());
        }
    }
}
