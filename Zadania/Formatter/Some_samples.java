package Formatter;

import java.util.Locale;

public class Some_samples {

    public static void main(String[] args) {

        practise();

    }

    private static void practise(){
        System.out.format("Samouczek Programisty istnieje od %d roku. Wszystkie artykuły pisze %s.%n%n", 2015, "Marcin");

        System.out.format("[%2$s] [%1$s] [%1$s]%n%n", "pierwszy argument", "drugi argument");

        System.out.format("[%10s] [%3s]%n%n", "test", "test");

        double x = 1.1234567890123;
        System.out.format("[%.10f] [%.3f] [%f]%n%n", x, x, x);

        double someNumber = 12345.12;
        System.out.format(Locale.US, "%,.2f%n", someNumber);
        System.out.format(Locale.GERMAN, "%,.2f%n", someNumber);
        System.out.format(Locale.forLanguageTag("PL"), "%,.2f%n%n", someNumber);


    }


}
