package Samouczek_programisty.Metody;

public class Z4 {

    public static void main(String[] args) {
        System.out.println(isEven(9));
        System.out.println(isEven(18));
        System.out.println(isEven(4));
        System.out.println(isEven(7));
        System.out.println(isEven(39));
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

}
