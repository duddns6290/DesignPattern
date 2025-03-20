package designpattern.iterator;

public class MenuTestDrive{
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu= new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress= new Waitress(pancakeHouseMenu, dinerMenu);
        // With iterators
        System.out.println("[All Menu]");
        waitress.printMenu();
        System.out.println("\n[Vegetarian Menu]");
        waitress.printVegetarianMenu();
    }
}
