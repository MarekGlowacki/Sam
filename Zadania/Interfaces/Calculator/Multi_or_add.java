package Interfaces;

import java.util.Scanner;

public class Multi_or_add {

    public static void main(String[] args) {
        Multi_or_add main = new Multi_or_add();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        }
        else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("If You want to multiply press: \"m\" or anything else to add");

        Scanner scan = new Scanner(System.in);

        String answear = scan.next();
        scan.nextLine();

        if (answear.equals("m")){
            return true;
        } else {
            return false;// tutaj zapytaj użytkownika co chce zrobić (mnożenie czy dodawanie)
        }
    }

    private double getArgument() {
        System.out.println("Podaj liczbę: ");
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextDouble()) {
            scan.nextLine();
            System.out.println("Nie otrzymałem poprawnej liczby, podaj jeszcze raz.");
        }

        Double argument = scan.nextDouble();

            return argument; // tutaj pobierz liczbę od użytkownika

    }

}
