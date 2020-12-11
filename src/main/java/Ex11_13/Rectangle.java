package Ex11_13;

public class Rectangle implements Area{
    private double height;
    private double width;

    public Rectangle(double newHeight, double newWidth) {
        this.height = newHeight;
        this.width = newWidth;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
