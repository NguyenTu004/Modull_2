package bai_2;

public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double volume(){
        return super.getArea()*height;
    }
    public String toString() {
        return "Cylinder{" +
                "radius='" + super.getRadius() + '\'' +
                "color='" + super.getColor() + '\'' +
                "height=" + height +'\'' +
                '}';
    }
}
