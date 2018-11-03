package Wyrazenia_regularne;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Zad3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz coś, a ja sprawdzę czy to poprawna nazwa miejscowości:");
        String wyrarzenie = scan.nextLine();

        Pattern pattern = Pattern.compile("[A-Z][a-z-]+([ -][A-Z][a-z]*)?([ -][A-Z][a-z]*)?");
        System.out.println((pattern.matcher(wyrarzenie).matches()));

    }

}
