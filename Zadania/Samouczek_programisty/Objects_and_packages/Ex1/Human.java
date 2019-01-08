package Samouczek_programisty.Objects_and_packages.Ex1;


import com.sun.xml.internal.fastinfoset.algorithm.BooleanEncodingAlgorithm;

public class Human {

    private Integer age;
    private Double weight;
    private Double height;
    private String name;
    private Boolean male;

    public Integer getAge(){
        return age;
    }

    public Double getWeight(){
        return weight;
    }

    public Double getHeight(){
        return height;
    }

    public String getName(){
        return name;
    }

    public Boolean isMale(){
        return male;
    }
}