package bai_5;

public class Triangle extends Shape{
    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;

    public Triangle() {
    }

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getArea(){
        double p = getPerimeter()/2;
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }
    public double getPerimeter(){
        return this.a+this.b+this.c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", Perimeter=" + getPerimeter() +
                ", Area=" + getArea() +
                ", Color=" + getColor() +
                '}';
    }
}
