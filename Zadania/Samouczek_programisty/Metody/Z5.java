package Samouczek_programisty.Metody;

public class Z5 {

    public static void main(String[] args) {

        System.out.println(isDivBy3And5(15));
        System.out.println(isDivBy3And5(132));
        System.out.println(isDivBy3And5(30));
        System.out.println(isDivBy3And5(12));
        System.out.println(isDivBy3And5(0));

    }

    public static boolean isDivBy3And5(int number){
        if (number % 3 == 0 && number % 5 ==0){
            return true;
        } else {
            return false;
        }
    }

}
