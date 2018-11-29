package RzutowanieIKonwersja;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Ex1 ex = new Ex1();
        System.out.println("Pierwsza liczba ");
        Scanner scan = new Scanner(System.in);

        double number1 = ex.getNumberFromUser(scan);

        System.out.println("Druga liczba ");

        double number2 = ex.getNumberFromUser(scan);

        double result1 = (number1 / number2);
        double result2 = (number2 / number1);

        System.out.format("Wynik dzielenia pierwszej liczby przez drugą to: %.3f%n", result1);
        System.out.format("Wynik dzielenia drugiej liczby przez pierwszą to: %.3f", result2);

    }

}
