package Samouczek_programisty.Primitive_types;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Ex2 ex = new Ex2();

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbę dziesiętną, a ja zamienię ją na binarną:");

        while (!scan.hasNextInt()){
            scan.nextLine();
            System.out.println("Potrzebuję liczby dziesiętnej, podaj jeszcz raz:");
        }

        int userNumber = scan.nextInt();

        ex.decToBin(userNumber);
    }

    public String decToBin(int decNumber){
        int divNum = decNumber;

        String binNumberRev = "";

        do {
            binNumberRev += divNum % 2;
            divNum = divNum/2;

        } while (divNum > 0);

        String binNumber = "";

        for (int i=binNumberRev.length()-1; i>-1; i--){
            binNumber += binNumberRev.charAt(i);
        }

        System.out.println(binNumber);

        return binNumber;
    }
}