package Ex11_13;

public class Main {
    static double finalArea = 0D;

    public static void main(String[] args) {

        Triangle t1 = new Triangle(1.1D, 0.37D);
        Triangle t2 = new Triangle(2.053D, 1.25D);
        Circle c1 = new Circle(2.32D);
        Rectangle r1 = new Rectangle(1.1, 0.9);

        Area[] figures = new Area[]{t1, t2, c1, r1};

        for (Area figure : figures) {
            System.out.println(figure.getArea());
            finalArea += figure.getArea();
        }
        System.out.println(finalArea);
        System.out.println(paintArea());

    }

    public static String paintArea() {
        double paintQuant = 19D;
        if (paintQuant < finalArea) ;
        return "Not enough paint to cover all figures.";
    }
}


