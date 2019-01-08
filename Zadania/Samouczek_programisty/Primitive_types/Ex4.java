package Samouczek_programisty.Primitive_types;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Ex4 ex = new Ex4();

        System.out.println("Podaj dowolny łańcuch znaków: ");

        Scanner scan = new Scanner(System.in);

        String uscan = scan.nextLine();

        ex.chainSingns(uscan);
    }

    public void chainSingns(String userChain) {

        System.out.println(userChain.length());

        String revUserChain = "";

        for (int i=userChain.length()-1; i>-1; i--){
            revUserChain += userChain.charAt(i);
        }

        if (userChain.toLowerCase().equals(revUserChain.toLowerCase())){
            System.out.println("To jest palindrom");
        } else {
            System.out.println("To nie jest palindrom");
        }

        System.out.printf("Odwrócony łacuch znaków to: %s", revUserChain);
    }

}
