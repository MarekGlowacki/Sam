package System_dwojkowy;

import static java.lang.Math.pow;

public class BinarySystem {

    private long binary;
    private long decimal;

    public static void main(String[] args) {
        BinarySystem binarySystem = new BinarySystem();

        binarySystem.decimalToBinary(21);
        binarySystem.decimalToBinary(1234);
        binarySystem.decimalToBinary(0);
        binarySystem.decimalToBinary(1);
//        binarySystem.decimalToBinary(-1);
//        binarySystem.decimalToBinary(-123);
        binarySystem.binaryToDecimal("10101");
        binarySystem.binaryToDecimal("0");
        binarySystem.binaryToDecimal("1");
        binarySystem.binaryToDecimal("10011010010");
//        binarySystem.binaryToDecimal("-1");
//        binarySystem.binaryToDecimal("-134");


    }

    public long getBinary(){
        return binary;
    }

    public long getDecimal(){
        return decimal;
    }

    public void decimalToBinary(long decimalNumb){
        if (decimalNumb == 0){
            binary = 0;
            System.out.format("Binarna forma liczby %d to %d%n", decimalNumb, decimal);
        } else if (decimalNumb < 0){
            throw new IllegalArgumentException("Liczba nie może być mniejsza od zera");
        } else {

            StringBuilder result = new StringBuilder();
            long newDecimalNumb = decimalNumb;
            do {
                long moduloLong = newDecimalNumb % 2;
                newDecimalNumb = newDecimalNumb / 2;

                String moduloString = Long.toString(moduloLong);
                result.append(moduloString).toString();
            } while (newDecimalNumb > 0);

            String reversed = "";

            for (int i = result.length()-1; i>=0; i--) {
                reversed += result.charAt(i);
            }

            binary = Long.valueOf(reversed);

            System.out.format("Binarna forma liczby %d to %d%n", decimalNumb, binary);
        }
    }

    public void binaryToDecimal(String binary){
        if (binary.charAt(0) == 0 && binary.length() == 1){
            decimal = 0;
        } else if (binary.charAt(0) == '-'){
            throw new IllegalArgumentException("Nie mogę przyjąć liczby mniejszej od 0.");
        } else {
            String reverseBinary = "";

            for (int i = binary.length()-1; i>=0; i--){
                reverseBinary += binary.charAt(i);
            }

            int result = 0;

            for (int i = 0; i<reverseBinary.length(); i++){
                String charToString = String.valueOf(reverseBinary.charAt(i));
                int stringToInt = Integer.valueOf(charToString);

                result += stringToInt * pow(2, i);
            }

            System.out.format("Dziesiętna forma liczby %s to %d%n", binary, result);
        }
    }
}