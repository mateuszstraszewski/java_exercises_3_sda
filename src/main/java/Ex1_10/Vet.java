package Ex1_10;

public class Vet {
    private Cat cat;
    private Dog dog;
    private Animal animal;

    public Vet() {

    }

//    public static String sayHello(Cat cat) {
//        return "Hello " + cat.getName();
//    }
//
//    public static String sayHello(Dog dog) {
//        return "Hello " + dog.getName();
//    }

    public static String sayHello(Animal animal) {
        return "Hello " + animal.getName();
    }
}
