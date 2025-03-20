package designpattern.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu{
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[5];
        addItem("Vegetarian BLT", "Bacon with lettuce & tomato", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato", false, 3.99);
        }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems[numberOfItems] = menuItem; // 배열에 아이템 추가
        numberOfItems++;
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
