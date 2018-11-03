package Wyrazenia_regularne;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Zad2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz coś, a ja sprawdzę czy to poprawny numer domu :)");
        String wyrarzenie = scan.nextLine();

        Pattern pattern = Pattern.compile("[0-9]+[A-Z]?\\\\[0-9]+[A-Z]?");
        System.out.println((pattern.matcher(wyrarzenie).matches()));

    }

}
