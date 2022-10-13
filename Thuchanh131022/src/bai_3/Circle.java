package bai_3;

public class Circle implements Resizeable{

    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        radius += radius* (percent/100);
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
