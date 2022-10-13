package bai_3;

public class Main {
    public static void main(String[] args) {
        Circle a = new Circle(2);
        a.resize(100);
        System.out.println(a.getRadius());
        System.out.println(a.getArea());
    }
}
