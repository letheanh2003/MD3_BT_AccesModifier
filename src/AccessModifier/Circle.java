package AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getArea() {
        System.out.println("isArea" + radius * radius * Math.PI);
    }
}
