package Formatter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Excercise1 {

    public static void main(String[] args) {
        format("plik.txt");
    }

    public static void format(String fileName) {
        File file = new File(fileName);

        try {
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                StringTokenizer token = new StringTokenizer(scan.nextLine(), ",");
                String name = token.nextToken().toString();
                double number = Double.parseDouble(token.nextElement().toString());
                String day = token.nextToken();

                System.out.format("| %-7s | %-7.2f | %-12s |%n", name, number, day);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Nie znalazłem pliku.");
        }
    }

}