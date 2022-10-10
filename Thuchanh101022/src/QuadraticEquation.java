import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(){
    }
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }

    public double delta(){
        return this.b*this.b-4*this.a*this.c;
    }
    public double no1(){
        return   (-this.b+Math.pow(delta(),0.5))/2*this.a;
    }
    public double no2(){
        return  (-this.b-Math.pow(delta(),0.5))/2*this.a;
    }
    public double no3(){
        return  (-this.b+Math.pow(Math.abs(delta()),0.5))/2*this.a;
    }
    public double no4(){
        return  (-this.b-Math.pow(Math.abs(delta()),0.5))/2*this.a;
    }
    public String Display(){
        return "QuadraticEquation: "+this.a+"x^2 "+this.b+"x "+this.c+" = 0";
    }

    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("Enter a: ");
        a = scanner.nextDouble();
        System.out.println("Enter b: ");
        b = scanner.nextDouble();
        System.out.println("Enter c: ");
        c = scanner.nextDouble();

        QuadraticEquation quadra = new QuadraticEquation(a,b,c);
        System.out.println(quadra.Display());
        if (a!=0){
            double delta = quadra.delta();
            if (delta>0){
                System.out.println("Nghiem x= "+quadra.no1());
                System.out.println("Nghiem x= "+quadra.no2());
            }else if (delta==0){
                System.out.println("Nghiem x= "+quadra.no1());
            }else {
                System.out.println("Nghiem phuc x= "+quadra.no3()+"i");
                System.out.println("Nghiem phuc x= "+quadra.no4()+"i");
            }
        }else {
            double no = -c/b ;
            System.out.println("Nghiem x= "+no);
        }
    }
}
