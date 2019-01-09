package Samouczek_programisty.Interface;

public class Triangle implements Figure {

    private double sideA;
    private double sideB;

    @Override
    public double getPerimeter(){
        return sideA + sideB + (Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)));
    }

    @Override
    public double getArea(){
        return (sideA * sideB) / 2;
    }
}
