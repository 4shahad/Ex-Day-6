package ExDay6;

public class CircleEx7 extends ShapeEx7 {
    protected double radius=1.0;
    public CircleEx7(){

    }

    public CircleEx7(double radius,String Color,boolean filled){
        super(Color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        double Area = Math.PI*radius*radius;
        return Area;
    }

    @Override
    public double getPerimeter() {
        double Perimeter = 2*Math.PI*radius;
        return Perimeter;
    }

    @Override
    public String toString() {
        return "CircleEx7[" +"Shape"+
                " [ Color='" + Color + '\'' +
                ", filled=" + filled +", radius=" + radius +
                ']';
    }
}
