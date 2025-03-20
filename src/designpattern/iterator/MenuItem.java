package designpattern.iterator;

public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;
    public MenuItem (String name, String description, boolean vegetarian,
                     double price ) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public java.lang.String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }
}
