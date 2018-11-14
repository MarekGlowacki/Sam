package Samouczek_programisty.Metody;

public class Z3 {

    public static void main(String[] args) {
        addSubMul(3, 5);
    }

    public static void addSubMul(int a, int b) {
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;

        System.out.println("Suma: " + sum + ", różnica: " + sub + ", mnożenie: " + mul);
    }

}
