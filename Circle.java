package ExDay6;

public class Circle {
    private double radius= 1.0;
    private String Color= "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.Color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
    public double getArea(){
      double Area = Math.PI*(radius/2);
  return Area;  }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", Color='" + Color + '\'' +
                ']';
    }
}
