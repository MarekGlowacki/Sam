package Samouczek_programisty.Primitive_types;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Ex3 ex = new Ex3();
        ex.userArray();

    }

    public void userArray() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj ile liczb zamierzasz podać:");

        while (!scan.hasNextInt()){
            scan.nextLine();
            System.out.println("Potrzebuję liczby, podaj jeszcze raz:");
        }

        int userNumber = scan.nextInt();

        int[] arr = new int[userNumber];
        System.out.println("W porządku, teraz podaj koljne liczby:");

        for (int i=0; i<userNumber; i++){
            System.out.printf("Liczba nr %d to: %n", i+1);

            while (!scan.hasNextInt()){
                scan.nextLine();
                System.out.println("Potrzebuję liczby, podaj jeszcze raz:");
            }

            int numbOfArr = scan.nextInt();
            arr[i] = numbOfArr;
        }

        int count = 0;
        int[] sortedArr = arr;

        while (count < arr.length - 2) {

            count = 0;

            for (int i=0; i<arr.length-1; i++){
                if (sortedArr[i] > sortedArr[i+1]){
                    int argArray = arr[i];
                    sortedArr[i] = arr[i+1];
                    sortedArr[i+1] = argArray;

                    count -= 1;
                } else {
                    count += 1;
                }
            }

        }

        System.out.println("Twoje posortowane liczby to: " + Arrays.toString(sortedArr));

    }

}