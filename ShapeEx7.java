package ExDay6;

public abstract class ShapeEx7 {
    protected String Color="red";
    protected boolean filled=true;

    public ShapeEx7() {
    }

    public ShapeEx7(String color, boolean filled) {
        Color = color;
        this.filled = filled;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled(){
        return filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "ShapeEx7{" +
                "Color='" + Color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
