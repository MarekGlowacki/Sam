package Wyrazenia_regularne;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz coś, a ja sprawdzę czy to liczba :)");
        String wyrarzenie = scan.nextLine();

        Pattern liczba = Pattern.compile("-?\\d*(,\\d+)?");

        System.out.println(liczba.matcher(wyrarzenie).matches());




    }

}
