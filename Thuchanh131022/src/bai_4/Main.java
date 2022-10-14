package bai_4;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
         shapes[0] = new Shape();
         shapes[1] = new Square();
         shapes[2] = new Square();
        for(Shape shape : shapes) {
            System.out.println(shape);
            if(shape instanceof Square) {
                System.out.println(((Square) shape).howToColor());
            }
        }
    }
}
