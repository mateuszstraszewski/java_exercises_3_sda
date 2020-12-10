package Ex11_13;

public class Circle {
    private double radius;

    public Circle(double newRadius) {
        this.radius = newRadius;
    }

    public double getArea(Circle circle) {
        return Math.PI * circle.radius * circle.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
