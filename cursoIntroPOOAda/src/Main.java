import Animals.Dog;

public class Main {
    public static void main(String[] args) {

        Dog dogOne = new Dog();

        dogOne.name = "Jimmy";
        dogOne.age = 9;
        dogOne.cor = "Marrom";
        dogOne.height = 50;
        dogOne.weight = 25;
        System.out.println(dogOne.name);

    }
}