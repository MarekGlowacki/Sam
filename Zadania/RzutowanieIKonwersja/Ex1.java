package RzutowanieIKonwersja;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Ex1 ex = new Ex1();

        Scanner scan = new Scanner(System.in);

        int number = ex.getNumberFromUser(scan);

        int intMultiplyPI = (int) (number * Math.PI);
        double doubleMultiplyPI = number * Math.PI;

        System.out.format("Mnożenie int: %d%n", intMultiplyPI);
        System.out.format("Mnożenie double: %f", doubleMultiplyPI);

    }

    public int getNumberFromUser(Scanner scan) {
        System.out.println("Podaj liczbę całkowitą:");

        while (true){
            try{
                return scan.nextInt();
            } catch (NoSuchElementException | IllegalStateException exeption) {
                System.out.println("Miała być cyfra całkowita. Spróbuj jeszcze raz:");
                scan.nextLine();
            }
        }
    }

}
