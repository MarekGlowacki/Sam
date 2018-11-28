package Testy_jednostkowe;

import java.util.*;

public class Basket {

    private Map<String, List<Double>> orderedItems = new HashMap<>();
    protected static final String ITEM_ORDER_FORMAT = "%s (%.2fx %.2f = %.2f)";

    public void main(String[] args) {
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

    public Map<String, List<Double>> getOrderedItems(){
        return orderedItems;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, List<Double>> itemOrder : orderedItems.entrySet()){
            String itemName = itemOrder.getKey();
            List<Double> itemANP = new LinkedList<>();
            itemANP = itemOrder.getValue();
            double itemAmount = itemANP.get(0);
            double itemPrice = itemANP.get(1);

            String itemString = String.format(ITEM_ORDER_FORMAT, itemName, itemAmount, itemPrice, itemAmount * itemPrice);

            result.append(itemString);
            result.append(System.lineSeparator());
        }

        result.append(String.format("Summary order is: %.2f zł.", summaryBasket()));
        System.out.println(result.toString());
        return result.toString();
    }

    public void addItem(String itemName, double amount, double price) {
        List<Double> list = new LinkedList<>();

        if (amount <= 0 || price < 0){
            throw new IllegalArgumentException(String.format("Illegal quantity %d!", amount));
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

    public void deleteItem(String itemName, double amount) {
        List<Double> list = new LinkedList<>();

        if (orderedItems.containsKey(itemName)) {
            if (amount > 0) {
                list = orderedItems.get(itemName);
                orderedItems.remove(itemName);
                double oldAmount = list.get(0);
                if (oldAmount >= amount) {
                    oldAmount -= amount;
                    System.out.format("Usunieto %.0fx %s.%n", amount, itemName);
                } else {
                    System.out.format("Podana ilość wykracza poza liczbę dostępnych sztuk, więc usunieto %.0fx %s.%n", oldAmount, itemName);
                    oldAmount = 0;
                }

                if (oldAmount > 0){
                    list.remove(0);
                    list.add(0, oldAmount);
                    orderedItems.put(itemName, list);
                    System.out.format("Pozostało %.0fx %s.%n", oldAmount, itemName);
                }

            } else {
                throw new IllegalArgumentException(String.format("There is no possibility to delete %d!", amount));
            }
        } else {
            throw new IllegalArgumentException(String.format("There is no item named %s!", itemName));
        }
    }

    public double summaryBasket(){
        double sum = 0;

        for (List<Double> list : orderedItems.values()){
            sum += list.get(0)*list.get(1);
        }
        return sum;
    }
}