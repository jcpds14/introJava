import Animals.Dog;

public class Main {
    public static void main(String[] args) {

        Dog dogOne = new Dog();
        Dog dogTwo = new Dog("Aron", "Marrom", 50, 20, 1, "nada");

        dogOne.setName("Jimmy");
        dogOne.setAge(9);
        dogOne.setColor("Marrom");
        dogOne.setHeight(50);
        dogOne.setWeight(25);

        System.out.println(dogTwo.getName());
        System.out.println(dogTwo.getAge());

        System.out.println(dogOne.getName() + " está " + dogOne.interact("carinho"));
        System.out.println(dogOne.getName() + " está " + dogOne.interact("nada"));
        System.out.println(dogOne.getName() + " está " + dogOne.interact("vai dormir!"));

    }
}