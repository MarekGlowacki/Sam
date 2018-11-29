package Testy_jednostkowe.SamouczekP;

public class Item {
    public static void main(String[] args) {
        String x = "123" + new Object();
        String y = new Object() + "123";
        String z = 1 + "123";

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}