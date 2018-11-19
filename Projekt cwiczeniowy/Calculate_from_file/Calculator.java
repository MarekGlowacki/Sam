package Calculate_from_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Calculator {

    public static void main(String[] args) {

        calculate("plik.txt");

    }

    public static double calculate(String fileName){
        File file = new File(fileName);
        int apply = 0;
        try {
            Scanner scan = new Scanner(file);


             while (scan.hasNextLine()) {
                 String operation = "";
                 int number = 0;
                 StringTokenizer token = new StringTokenizer(scan.nextLine());
                 operation = token.nextToken();
                 number = Integer.parseInt(token.nextToken());
                 if (operation.equals("apply")) {
                     apply = number;
                 }

             }

             Scanner newscan = new Scanner(file);

            while (newscan.hasNextLine()) {
                String operation = "";
                StringTokenizer token = new StringTokenizer(newscan.nextLine());
                operation = token.nextToken();
                if (operation.equals("add")) {
                    apply = apply + Integer.parseInt(token.nextToken());
                } else if (operation.equals("subtract")) {
                    apply = apply - Integer.parseInt(token.nextToken());
                } else if (operation.equals("multiply")) {
                    apply = apply * Integer.parseInt(token.nextToken());
                } else if (operation.equals("divide")) {
                    apply = apply / Integer.parseInt(token.nextToken());
                }
            }
            System.out.println(apply);

        } catch (FileNotFoundException e) {
            System.out.println("Can't find a file.");

        }

            return apply;
    }

}
