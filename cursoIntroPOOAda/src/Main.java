import Animals.Animal;
import Animals.Bird;
import Animals.Cat;
import Animals.Dog;
import Stores.PetShop;

public class Main {
    public static void main(String[] args) {

        Dog dogOne = new Dog("Aron", "Marrom", 50, 20, 1, "nada");

        Cat catOne = new Cat("Felix", "Preto", 5.5);
        Animal catTwo = new Cat("Felix", "Preto", 5.5);
        Animal birdThree = new Bird("Felix", "Preto", 5.5);


        Bird birdOne = new Bird("Jhonny", "Marrom", 1);

        PetShop petShop = new PetShop();

        petShop.giveAShower(catOne);
        System.out.println(catOne.getName() + " está " + catOne.getStateOfMind());

        catOne.sound();
        birdThree.sound();
        dogOne.sound();

    }
}