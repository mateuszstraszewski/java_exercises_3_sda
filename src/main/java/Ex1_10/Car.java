package Ex1_10;

public class Car implements Movable {
    String carName;

    public Car(String newCarName){
        this.carName = newCarName;
    }

    @Override
    public void Movable() {
        System.out.println("I am riding!");
    }
}
