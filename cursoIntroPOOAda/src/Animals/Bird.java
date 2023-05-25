package Animals;

public class Bird extends Animal{

    static int numberOfBirds;
    public Bird(String name, String color, double weight) {
        super(name, color, weight);
    }

    @Override
    public void sound() {
        System.out.println("PIU PIU");
    }
}