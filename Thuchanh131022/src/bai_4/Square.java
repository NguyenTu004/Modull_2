package bai_4;

public class Square extends Shape implements Colorable{
    public Square() {
    }

    public Square(String color, boolean filled) {
        super(color, filled);
    }

    @Override
    public String howToColor() {
        return  "Color all four sides...";
    }
}
