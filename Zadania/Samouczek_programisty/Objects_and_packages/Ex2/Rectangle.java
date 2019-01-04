package Samouczek_programisty.Objects_and_packages.Ex2;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class Rectangle {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle.diagonalLength(4, 5));
        System.out.println(rectangle.field(4, 5));
        System.out.println(rectangle.perimeter(4, 5));
    }

    private double length;
    private double width;

    public double field(double length, double width) {
        return length * width;
    }

    public double perimeter(double length, double width) {
        return 2 * length + 2 * width;
    }

    public double diagonalLength(double length, double width) {
        return sqrt(pow(length, 2d) + pow(width, 2d));
    }

}
