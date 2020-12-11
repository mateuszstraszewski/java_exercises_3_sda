package Ex11_13;

public class Triangle implements Area{
    private double height;
    private double base;

    public Triangle(double newHeight, double newBase) {
        this.height = newHeight;
        this.base = newBase;
    }

    @Override
    public double getArea()
    {
        return 0.5 * this.height * this.base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getBase()
    {
        return base;
    }

    public double getHeight()
    {
        return height;
    }
}
