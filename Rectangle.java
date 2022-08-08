package ExDay6;

public class Rectangle extends ShapeEx7{
    protected double width=1.0;
    protected double length=1.0;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(double width, double length , String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {

        return "RectangleEx7[" +"Shape"+
                " [ Color='" +"["+ Color + '\'' +
                ", filled=" + filled +"]"+ "width=" + width +
                ", length=" + length +
                ']';
    }

    @Override
    public double getArea() {
        double Area = width*length;
        return Area;
    }

    @Override
    public double getPerimeter() {
        final double per = length + width;
        double Perimeter = 2*per;
        return Perimeter;
    }
}
