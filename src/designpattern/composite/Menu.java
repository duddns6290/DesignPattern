package designpattern.composite;


import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;
    int price;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return (MenuComponent)menuComponents.get(i);
    }

    public String getName() {return name;}
    public String getDescription() {return description;}
    public double getPrice() {
        return price;
    }
    public void print(){
        Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
}
