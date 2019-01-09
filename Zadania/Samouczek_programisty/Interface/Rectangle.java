package Samouczek_programisty.Interface;

public class Rectangle implements Figure {

    private double sideA;
    private double sideB;

    public Rectangle(double sideB, double sideA){
        this.sideB = sideB;
        this.sideA = sideA;
    }

    @Override
    public double getPerimeter() {
        return 2 * sideA + 2 * sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String getType(){
        return "Rectangle";
    }
}