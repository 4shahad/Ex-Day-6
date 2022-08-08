package ExDay6;

public class CircleEx3 implements GeometricObject {
    protected double radius;

    public CircleEx3(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimete() {
        double Perimeter = 2*Math.PI*radius;
        return Perimeter;
    }

    public double getArea(){
        double Area = Math.PI*radius*radius;
        return Area;
    }

    @Override
    public String toString() {
        return "CircleEx3[" +
                "radius=" + radius +
                ']';
    }
}
