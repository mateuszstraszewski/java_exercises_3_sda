package Ex1_10;

public class Cat extends Vet implements Animal, Movable {
    String catName;
    int mouseCount = 1;

    public Cat(String newCatName) {
        this.catName = newCatName;
    }

    @Override
    public String getName() {
        return this.catName;
    }

    @Override
    public String makeSound() {
        return "Cat name is " + this.catName + " and it says meow!";
    }

    public void eatMouse() {
        System.out.println(this.catName + " ate " + this.mouseCount + " mice.");
        mouseCount++;
    }

    @Override
    public void Movable() {
        System.out.println(this.catName + " is running.");
    }

}
