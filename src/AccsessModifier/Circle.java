package AccsessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    private Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void getArea() {
        System.out.println("Area is: " + (int) (Math.pow(radius, 2) * Math.PI));
    }
}
