package bai_2;

public class Circle {
    private static double radius=1.0;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        Circle.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        Circle.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius='" + radius + '\'' +
                "color='" + color + '\'' +
                '}';
    }
}
