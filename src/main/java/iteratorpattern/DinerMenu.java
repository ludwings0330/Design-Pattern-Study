package iteratorpattern;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("채식주의자용 BLT", "통밀 위에 상추 토마토", true, 2.99);

        addItem("핫도그", "소세지 양념 양파, 치즈", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("메뉴를 추가할 수 없습니다. 메뉴가 가득 찼습니다.");
            return;
        }

        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems[numberOfItems++] = menuItem;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
