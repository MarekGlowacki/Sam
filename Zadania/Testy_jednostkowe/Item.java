package Testy_jednostkowe;

public class Item {

    private static String name;
    private static double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static String getName(){
        return name;
    }

    public static double getPrice(){
        return price;
    }

}