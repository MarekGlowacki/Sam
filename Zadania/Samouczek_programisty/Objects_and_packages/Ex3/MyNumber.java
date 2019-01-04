package Samouczek_programisty.Objects_and_packages.Ex3;

public class MyNumber {

    private double number;

    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(2565);

        System.out.println(myNumber.isOdd());
        System.out.println(myNumber.isEven());
        System.out.println(myNumber.pow(myNumber));
        System.out.printf("square root of %.0f is: %.3f%n", myNumber.number, myNumber.sqrt());
    }


    public MyNumber(double number) {
        this.number = number;
    }

    public boolean isOdd() {
        if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    public boolean isEven() {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public double sqrt() {

        double num;
        num = number / 2d;

        while (true) {

            double num2 = (num + (number / num)) / 2d;

            if (num - num2 < 0.001d) {
                return num2;
            } else {
                num = num2;
            }
        }
    }

    public MyNumber pow(MyNumber pow) {
        return new MyNumber(number * pow.number);
    }

    public MyNumber add(MyNumber x) {
        return new MyNumber(number + x.number);
    }

    public MyNumber substract(MyNumber x){
        return new MyNumber(number / x.number);
    }
}