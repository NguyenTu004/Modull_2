package IllegalTriangleException;

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.InputMismatchException;
public class Main {

    public static void main(String[] args) {
        boolean flag = false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhap canh a: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap canh b: ");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap canh c: ");
                int c = Integer.parseInt(scanner.nextLine());
                checkTriangle(a, b, c);
            } catch (IllegalTriangleException exception) {
                System.err.println("Triangle exception occur: ");
                flag = true;
            } catch (Exception exception) {
                System.err.println("Invalid input");
                flag = true;
            }
        }while (flag);
    }
    public static void checkTriangle(int a, int b,int c) throws IllegalTriangleException{
        boolean isTriangle = ((a > 0 || b > 0 || c > 0)&& a + b > c && a + c > b && b + c > a);
        if(isTriangle){
            System.out.println("Valid triangle");
        }else {
            throw new IllegalTriangleException("Invalid Triangle");
        }

    }
}
