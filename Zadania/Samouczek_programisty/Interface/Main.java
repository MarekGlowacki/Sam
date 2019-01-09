package Samouczek_programisty.Interface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[3];

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj promień koła:");
        figures[0] = new Circle(scan.nextDouble());

        System.out.println("Podaj 2 długości boków trójkąta:");
        figures[1] = new Triangle(scan.nextDouble(), scan.nextDouble());

        System.out.println("Podaj 2 długości boków prostokąta:");
        figures[2] = new Rectangle(scan.nextDouble(), scan.nextDouble());

        for (Figure figure : figures){
            System.out.println(figure.getType());
            System.out.println("Obwód to: " + figure.getPerimeter());
            System.out.println("Pole to: " + figure.getArea());
        }
    }
}
