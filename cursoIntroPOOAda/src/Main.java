import Animals.Dog;

public class Main {
    public static void main(String[] args) {

        Dog dogOne = new Dog("Aron", "Marrom", 50, 20, 1, "nada");
        Dog dogTwo = new Dog("Jimmy", "Marrom", 50, 20, 1, "nada");


        System.out.println(dogOne.toString());
        System.out.println(dogTwo.toString());
        System.out.println(dogOne.getNumberOfDogs());
        System.out.println("------------------");
        System.out.println(dogOne.toString());
        System.out.println(dogTwo.toString());

        System.out.println(dogTwo.getNumberOfDogs());
        System.out.println(dogOne.getNumberOfDogs());

    }
}