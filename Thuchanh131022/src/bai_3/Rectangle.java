package bai_3;

public class Rectangle implements Resizeable{
    private double x, y;
    @Override
    public void resize(double percent) {
        x+=x*percent/100;
        y+=y*percent/100;
    }
    public double getArea(){
        return x*y;
    }
}
