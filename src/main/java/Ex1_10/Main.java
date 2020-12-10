package Ex1_10;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Mike");
        Cat cat2 = new Cat("George");
        Cat cat3 = new Cat("Daisy");
        Dog dog1 = new Dog("Ralf");
        Dog dog2 = new Dog("Oscar");

        Cat[] catTable = new Cat[]{cat1, cat2, cat3};
        Animal[] animalTable = new Animal[]{cat1, cat2, cat3, dog1, dog2};

//        System.out.println("------------------------------");
//        for (Cat cats : catTable) {
//            cats.makeSound();
//        }
//        System.out.println("------------------------------");
//        for (Animal animal : animalTable) {
//            animal.makeSound();
//        }
//        System.out.println("------------------------------");

//        cat1.eatMouse();
//        cat1.eatMouse();
//        cat1.eatMouse();
//        cat2.eatMouse();

        System.out.println(Vet.sayHello(cat1));
        System.out.println(Vet.sayHello(dog1));
        System.out.println(Vet.sayHello(cat1));





    }
}
