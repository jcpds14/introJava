package Animals;

public class Cat extends Animal{

    public Cat(String name, String color, double weight) {
        super(name, color, weight);
    }

    static int numberOfCats;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public void sound() {
        System.out.println("Meow Meow");
    }
}