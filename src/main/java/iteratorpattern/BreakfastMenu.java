package iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class BreakfastMenu {
    List<MenuItem> menuItems;

    public BreakfastMenu() {
        this.menuItems = new ArrayList<>();

        addItem("K&B 팬케이크 세트",
                "스크램블 에그와 토스트가 곁들여진 팬케이크",
                true,
                2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
