
import java.util.Scanner;
public class Recctangle {
    double width, height;
    public Recctangle(){
    }
    public Recctangle(double width, double height){
        this.width=width;
        this.height=height;
    }

    public double getPrimeter(){
        return (this.height+this.width)*2;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public String Display(){
        return "Rectangle{"+"width= "+width+", height= "+height+"}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();
        Recctangle rectangle = new Recctangle(width,height);
        System.out.println("Your rectangle \n"+rectangle.Display());
        System.out.println("Perimeter of the rectangle: "+rectangle.getPrimeter());
        System.out.println("Area of the rectangle: "+ rectangle.getArea());
    }
}
