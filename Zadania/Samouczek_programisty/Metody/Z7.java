package Samouczek_programisty.Metody;

import static java.lang.StrictMath.sqrt;

public class Z7 {

    public static void main(String[] args) {

        System.out.println(numToSqrt(4));
        System.out.println(numToSqrt(16));
        System.out.println(numToSqrt(9));
        System.out.println(numToSqrt(25));

    }

    public static double numToSqrt(double number) {
       return sqrt(number);
    }

}
