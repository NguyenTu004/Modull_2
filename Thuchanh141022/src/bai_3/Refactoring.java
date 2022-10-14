package bai_3;

public class Refactoring {
//    public static double getVolume(int radius, int height){
//        double baseArea = Math.PI * radius * radius;
//        double perimeter = 2 * Math.PI  * radius;
//        double volume = perimeter * height + 2 * baseArea;
//        return volume;
//    }
    public static double getVolume(int radius, int height) {
        double baseArea = getArea(radius);
        double perimeter = getPerimeter(radius);
        return perimeter * height + 2 * baseArea;

    }
    private static double getArea(int radius){
        return radius * radius*Math.PI;
    }
    private static double getPerimeter(int radius){
        return 2 * radius * Math.PI;
    }
}
