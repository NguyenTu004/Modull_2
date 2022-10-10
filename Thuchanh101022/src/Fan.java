import java.util.Arrays;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed;
    boolean on = false;
    double radius;
    String color;

    public Fan(){}
    public Fan(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    public boolean turnOn(){
       return on= true;
    }
    public boolean turnOff(){
       return on= false;
    }

    public double getRadius() {
        return radius;
    }
    public int getFAST() {
        return FAST;
    }
    public int getMEDIUM() {
        return MEDIUM;
    }
    public int getSLOW() {
        return SLOW;
    }
    public int getSpeed() {
        return speed;
    }
    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(10,"balck");
        System.out.println("On: "+fan1.turnOff()+" Speed: "+fan1.getSLOW()+" Radius: "+fan1.getRadius()+" Color: "+fan1.getColor());

    }
}
