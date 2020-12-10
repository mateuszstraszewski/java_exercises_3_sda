package Ex1_10;

public class Dog extends Animal implements Movable {
    String dogName;

    public Dog(String newCatName) {
        this.dogName = newCatName;
    }
    @Override
    public void makeSound() {
        System.out.println("Dog name is " + this.dogName + " and it says woow!");
    }

    @Override
    public void Movable() {
        System.out.println(this.dogName + " is running.");
    }
}
