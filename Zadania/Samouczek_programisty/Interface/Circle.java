package Samouczek_programisty.Interface;

public class Circle implements Figure {

    private double radius;

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea(){
        return Math.PI * (radius * radius);
    }
}
