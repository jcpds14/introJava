import Animals.Bird;
import Animals.Cat;
import Animals.Dog;

public class Main {
    public static void main(String[] args) {

        Dog dogOne = new Dog("Aron", "Marrom", 50, 20, 1, "nada");

        Cat catOne = new Cat("Felix", "Preto", 5.5);

        Bird birdOne = new Bird("Jhonny", "Marrom", 1);

        dogOne.sound();
        catOne.sound();
        birdOne.sound();

    }
}