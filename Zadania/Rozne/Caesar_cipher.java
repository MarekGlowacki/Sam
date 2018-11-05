package Rozne;

import java.util.Scanner;

public class Caesar_cipher {

    public static int ascii_encrypt = 3;
    public static int ascii_decrypt = 3;
    public static char letter;
    public static int ascii = 0;
    public static String encrypted_statment = "";
    public static String decrypted_statment = "";

    public static void main(String[] args) {


        System.out.println("Press \"e\" to encrypt, \"d\" to decrypt or \"-\" to end program:");

        Scanner scan = new Scanner(System.in);

        while (true) {
            String decision = scan.nextLine();

            if (decision.equals("-")) break;

            if (decision.equals("e")) {
                System.out.println("Write sentence to encrypt:");
                encrypt(scan.nextLine());

            } else if (decision.equals("d")) {
                System.out.println("Write sentence to decrypt:");
                decrypt(scan.nextLine());
            } else {
                System.out.println("You entered something else, please try again.");
                System.out.println("Press \"e\" to encrypt or \"d\" to decrypt or \"-\" to end program:");
            }
        }

        System.out.println("bye");
    }

    static String encrypt(String sentence_to_encrypt) {


        encrypted_statment = "";

        for (int i = 0; i < sentence_to_encrypt.length(); i++) {
            letter = sentence_to_encrypt.charAt(i);
            ascii = letter;

            if (ascii > 64 && ascii < 91) {
                ascii += ascii_encrypt;
                if (ascii > 90) {
                    ascii -= 26;
                }
                letterToEncryptedStatment();
            } else if (ascii == 32) {
                letterToEncryptedStatment();
            } else if (ascii > 96 && ascii < 123) {
                ascii += ascii_encrypt;
                if (ascii > 122) {
                    ascii -= 26;
                }
                letterToEncryptedStatment();
            } else if (ascii > 47 && ascii < 58) {
                ascii += ascii_encrypt;
                if (ascii > 57) {
                    ascii -= 10;
                }
                letterToEncryptedStatment();
            } else if (ascii > 32 && ascii < 48) {
                ascii += ascii_encrypt;
                if (ascii > 47) {
                    ascii -= 15;
                }
                letterToEncryptedStatment();
            } else if (ascii > 57 && ascii < 65) {
                ascii += ascii_encrypt;
                if (ascii > 64) {
                    ascii -= 7;
                }
                letterToEncryptedStatment();
            } else if (ascii > 90 && ascii < 97) {
                ascii += ascii_encrypt;
                if (ascii > 96) {
                    ascii -= 6;
                }
                letterToEncryptedStatment();
            } else if (ascii > 122 && ascii < 127) {
                ascii += ascii_encrypt;
                if (ascii > 126) {
                    ascii -= 4;
                }
                letterToEncryptedStatment();
            } else if (ascii == 260) {
                ascii = 321;
                letterToEncryptedStatment();
            } else if (ascii == 262) {
                ascii = 323;
                letterToEncryptedStatment();
            } else if (ascii == 280) {
                ascii = 211;
                letterToEncryptedStatment();
            } else if (ascii == 321) {
                ascii = 346;
                letterToEncryptedStatment();
            } else if (ascii == 323) {
                ascii = 377;
                letterToEncryptedStatment();
            } else if (ascii == 211) {
                ascii = 379;
                letterToEncryptedStatment();
            } else if (ascii == 346) {
                ascii = 261;
                letterToEncryptedStatment();
            } else if (ascii == 377) {
                ascii = 263;
                letterToEncryptedStatment();
            } else if (ascii == 379) {
                ascii = 281;
                letterToEncryptedStatment();
            } else if (ascii == 261) {
                ascii = 322;
                letterToEncryptedStatment();
            } else if (ascii == 263) {
                ascii = 324;
                letterToEncryptedStatment();
            } else if (ascii == 281) {
                ascii = 243;
                letterToEncryptedStatment();
            } else if (ascii == 322) {
                ascii = 347;
                letterToEncryptedStatment();
            } else if (ascii == 324) {
                ascii = 378;
                letterToEncryptedStatment();
            } else if (ascii == 243) {
                ascii = 380;
                letterToEncryptedStatment();
            } else if (ascii == 347) {
                ascii = 260;
                letterToEncryptedStatment();
            } else if (ascii == 378) {
                ascii = 262;
                letterToEncryptedStatment();
            } else if (ascii == 380) {
                ascii = 280;
                letterToEncryptedStatment();
            }

        }
            System.out.println("Your encykrypt sentence is: " + encrypted_statment + "\n");
            System.out.println("Press \"e\" to encrypt next sentence, \"d\" to decrypt next sentence or \"-\" to end program:");

        return encrypted_statment;
    }

    static String decrypt(String sentence_to_decrypt) {

        decrypted_statment = "";

        for (int i = 0; i < sentence_to_decrypt.length(); i++) {

            letter = sentence_to_decrypt.charAt(i);
            ascii = letter;

            if (ascii > 64 && ascii < 91) {
                ascii -= ascii_decrypt;
                if (ascii < 65) {
                    ascii += 26;
                }
                letterToDecryptedStatment();
            } else if (ascii == 32) {
                letterToDecryptedStatment();
            } else if (ascii > 96 && ascii < 123) {
                ascii -= ascii_decrypt;
                if (ascii < 97) {
                    ascii += 26;
                }
                letterToDecryptedStatment();
            } else if (ascii > 47 && ascii < 58) {
                ascii -= ascii_decrypt;
                if (ascii < 48) {
                    ascii += 10;
                }
                letterToDecryptedStatment();
            } else if (ascii > 32 && ascii < 48) {
                ascii -= ascii_decrypt;
                if (ascii < 33) {
                    ascii += 15;
                }
                letterToDecryptedStatment();
            } else if (ascii > 57 && ascii < 65) {
                ascii -= ascii_decrypt;
                if (ascii < 58) {
                    ascii += 7;
                }
                letterToDecryptedStatment();
            } else if (ascii > 90 && ascii < 97) {
                ascii -= ascii_decrypt;
                if (ascii < 91) {
                    ascii += 6;
                }
                letterToDecryptedStatment();
            } else if (ascii > 122 && ascii < 127) {
                ascii -= ascii_decrypt;
                if (ascii < 122) {
                    ascii += 4;
                }
                letterToDecryptedStatment();
            } else if (ascii == 260) {
                ascii = 347;
                letterToDecryptedStatment();
            } else if (ascii == 262) {
                ascii = 378;
                letterToDecryptedStatment();
            } else if (ascii == 280) {
                ascii = 380;
                letterToDecryptedStatment();
            } else if (ascii == 321) {
                ascii = 260;
                letterToDecryptedStatment();
            } else if (ascii == 323) {
                ascii = 262;
                letterToDecryptedStatment();
            } else if (ascii == 211) {
                ascii = 280;
                letterToDecryptedStatment();
            } else if (ascii == 346) {
                ascii = 321;
                letterToDecryptedStatment();
            } else if (ascii == 377) {
                ascii = 323;
                letterToDecryptedStatment();
            } else if (ascii == 379) {
                ascii = 211;
                letterToDecryptedStatment();
            } else if (ascii == 261) {
                ascii = 346;
                letterToDecryptedStatment();
            } else if (ascii == 263) {
                ascii = 377;
                letterToDecryptedStatment();
            } else if (ascii == 281) {
                ascii = 379;
                letterToDecryptedStatment();
            } else if (ascii == 322) {
                ascii = 261;
                letterToDecryptedStatment();
            } else if (ascii == 324) {
                ascii = 263;
                letterToDecryptedStatment();
            } else if (ascii == 243) {
                ascii = 281;
                letterToDecryptedStatment();
            } else if (ascii == 347) {
                ascii = 322;
                letterToDecryptedStatment();
            } else if (ascii == 378) {
                ascii = 324;
                letterToDecryptedStatment();
            } else if (ascii == 380) {
                ascii = 243;
                letterToDecryptedStatment();
            }

        }
        System.out.println("Your decykrypt sentence is: " + decrypted_statment + "\n");
        System.out.println("Press \"e\" to encrypt next sentence, \"d\" to decrypt next sentence or \"-\" to end program:");

        return decrypted_statment;
    }

    public static void letterToEncryptedStatment(){
        letter = (char) ascii;
        encrypted_statment += letter;
    }

    public static void letterToDecryptedStatment(){
        letter = (char) ascii;
        decrypted_statment += letter;
    }

}
