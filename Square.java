package ExDay6;

public class Square extends Rectangle{
    protected double Side=1.0;

    public Square() {
    }

    public Square(double side) {
        Side = side;
    }

    public Square( double side ,String color, boolean filled) {
        super(color, filled);
        Side = side;
    }

    public double getSide() {
        return Side;
    }

    public void setSide(double side) {
        Side = side;
    }

    public void setWidth (double side){
        this.setWidth(side);
    }
    public void setLength (double side){
        this.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[ Rectangle [ Shape [" +

                ", Color='" + Color + '\'' +
                ", filled=" + filled +
                ']'  +
                ", width=" + Side +
                ", length=" + Side ;
    }

    @Override
    public double getArea() {
        double Area = Side*Side;
        return Area;
    }

    @Override
    public double getPerimeter() {
        double Perimeter = 4*Side;
        return Perimeter;
    }
}
