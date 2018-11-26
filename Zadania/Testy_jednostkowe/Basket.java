package Testy_jednostkowe;

import java.util.*;

public class Basket {

    private static Map<String, List<Double>> orderedItems = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(orderedItems);
        addItem("Book", 3, 4.58);
        System.out.println(orderedItems);
        addItem("Book", 3, 6.29);
        System.out.println(orderedItems);
        addItem("Book", 3, 2.23);
        System.out.println(orderedItems);
        addItem("Bike", 5, 23);
        addItem("Bike", 5, 23);
        addItem("Bike", 5, 23);
        System.out.println(orderedItems);
        addItem("Book", 6, 67);
        System.out.println(orderedItems);
        addItem("Mobile", 10, 87.98);
        deleteItem("Book", 2);
        System.out.println(orderedItems);
        deleteItem("Bike", 4);
        System.out.println(orderedItems);
        deleteItem("Mobile", 2);
        deleteItem("Book", 7);
        System.out.println(orderedItems);
        deleteItem("Bike", -4);
        System.out.println(orderedItems);
        System.out.format("Całość zamówienia to: %.2f zł.", summaryBasket());

    }

    public static void addItem(String itemName, double amount, double price) {
        List<Double> list = new LinkedList<>();

        if (amount <= 0){
            System.out.println("Podana ilość, jest niewłaściwa.");
        } else if (orderedItems.containsKey(itemName)){

            list = orderedItems.get(itemName);
            double newAmount = amount + list.get(0);

            list.remove(0);
            list.remove(0);
            list.add(newAmount);
            list.add(price);
            orderedItems.put(itemName, list);
            System.out.format("Dodano %.0fx %s w cenie %.2f.%n", amount, itemName, price);
        } else {
            list.add(amount);
            list.add(price);
            orderedItems.put(itemName, list);
            System.out.format("Dodano %.0fx %s w cenie %.2f.%n", amount, itemName, price);
        }

    }

    public static void deleteItem(String itemName, double amount) {
        List<Double> list = new LinkedList<>();

        if (orderedItems.containsKey(itemName)) {
            if (amount > 0) {
                list = orderedItems.get(itemName);
                orderedItems.remove(itemName);
                double newAmount = list.get(0);
                if (newAmount >= amount) {
                    newAmount -= amount;
                    System.out.format("Usunieto %.0fx %s.%n", amount, itemName);
                } else {
                    System.out.format("Podana ilość wykracza poza liczbę dostępnych sztuk, więc usunieto %.0fx %s.%n", newAmount, itemName);
                }
                list.remove(0);

                list.add(0, newAmount);
                orderedItems.put(itemName, list);
                System.out.format("Pozostało %.0fx %s.%n", newAmount, itemName);

            } else {
                System.out.format("Nie ma możliwości usunąć takiej ilośći %s.%n", itemName);
            }
        } else {
            System.out.println("Nie ma takiego produktu.");
        }
    }

    public static double summaryBasket(){
        double sum = 0;

        for (List<Double> list : orderedItems.values()){
            sum += list.get(0)*list.get(1);
        }
        return sum;
    }
}