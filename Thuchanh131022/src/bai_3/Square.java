package bai_3;

public class Square implements Resizeable{
    private double x;
    @Override
    public void resize(double percent) {
        x += x*percent/100;
    }

    @Override
    public double getArea() {
        return x*x;
    }
}
