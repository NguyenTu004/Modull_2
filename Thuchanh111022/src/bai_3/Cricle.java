package bai_3;

public class Cricle {
    private double radius;
    private String color;

    public Cricle() {
    }
    public Cricle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*3.1416;
    }
}

