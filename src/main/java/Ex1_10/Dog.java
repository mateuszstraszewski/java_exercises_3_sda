package Ex1_10;

public class Dog extends Vet implements Animal, Movable {
    String dogName;

    public Dog(String newDogName) {
        this.dogName = newDogName;
    }

    @Override
    public String getName() {
        return this.dogName;
    }

    @Override
    public String makeSound() {
        return "Dog name is " + this.dogName + " and it says woow!";
    }

    @Override
    public void Movable() {
        System.out.println(this.dogName + " is running.");
    }
}
