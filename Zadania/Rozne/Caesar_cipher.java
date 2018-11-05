package Rozne;

import java.util.Scanner;

public class Caesar_cipher {

    public static void main(String[] args) {

        encryption();

    }

    static String encryption() {

        System.out.println("Write sentence to encrypt");

        Scanner scan = new Scanner(System.in);

        String encrypted_statment = "";

        while (true) {
            String sentence_to_encrypt = scan.nextLine();

            if (sentence_to_encrypt.equals("-")) {
                break;
            }
            encrypted_statment = "";

            for (int i = 0; i < sentence_to_encrypt.length(); i++) {
                int ascii = 0;
                char letter = sentence_to_encrypt.charAt(i);
                ascii = letter;

                if (ascii > 64 && ascii < 91) {
                    ascii += 3;
                    if (ascii > 90) {
                        ascii -= 26;
                    }
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii == 32) {
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii > 96 && ascii < 123) {
                    ascii += 3;
                    if (ascii > 122) {
                        ascii -= 26;
                    }
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii > 47 && ascii < 58) {
                    ascii += 3;
                    if (ascii > 57) {
                        ascii -= 10;
                    }
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii > 32 && ascii < 48) {
                    ascii += 3;
                    if (ascii > 47) {
                        ascii -= 15;
                    }
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii > 57 && ascii < 65) {
                    ascii += 3;
                    if (ascii > 64) {
                        ascii -= 7;
                    }
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii > 90 && ascii < 97) {
                    ascii += 3;
                    if (ascii > 96) {
                        ascii -= 6;
                    }
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii > 122 && ascii < 127) {
                    ascii += 3;
                    if (ascii > 126) {
                        ascii -= 4;
                    }
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii == 260) {
                    ascii = 321;
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii == 262) {
                    ascii = 323;
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii == 280) {
                    ascii = 211;
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii == 321) {
                    ascii = 346;
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii == 323) {
                    ascii = 377;
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii == 211) {
                    ascii = 379;
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii == 346) {
                    ascii = 261;
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii == 377) {
                    ascii = 263;
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii == 379) {
                    ascii = 281;
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii == 261) {
                    ascii = 322;
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii == 263) {
                    ascii = 324;
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii == 281) {
                    ascii = 243;
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii == 322) {
                    ascii = 347;
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii == 324) {
                    ascii = 378;
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii == 243) {
                    ascii = 380;
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii == 347) {
                    ascii = 260;
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii == 378) {
                    ascii = 262;
                    letter = (char) ascii;
                    encrypted_statment += letter;
                } else if (ascii == 380) {
                    ascii = 280;
                    letter = (char) ascii;
                    encrypted_statment += letter;
                }

            }
            System.out.println("Your encykrypt sentence is: " + encrypted_statment + "\n");
            System.out.println("Write next sentence to encrypt (or press \"-\" to end program):");
        }

        return encrypted_statment;
    }

}
