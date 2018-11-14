package Samouczek_programisty.Metody;

import static java.lang.Math.pow;

public class Z6 {

    public static void main(String[] args) {

        System.out.println(numToPow(2));
        System.out.println(numToPow(3));
        System.out.println(numToPow(4));

    }

    public static double numToPow(double number){
        return pow(number, 3);
    }

}
