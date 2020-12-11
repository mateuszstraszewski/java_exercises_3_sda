package Ex11_13;

public class Circle implements Area {
    private double radius;

    public Circle(double newRadius) {
        this.radius = newRadius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
}
