package Samouczek_programisty.Metody;

import static java.lang.Math.pow;

public class Z8 {

    public static void main(String[] args) {

        System.out.println(isRectangularTriange(3, 4, 5));
        System.out.println(isRectangularTriange(8, 3, 10));

    }

    public static boolean isRectangularTriange(double a, double b, double c) {
        if (pow(a, 2) + pow(b, 2) == pow(c, 2)) {
            return true;
        } else {
            return false;
        }
    }

}
