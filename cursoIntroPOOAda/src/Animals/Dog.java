package Animals;

public class Dog extends Animal {

    static int numberOfDogs;

    //Default constructor

    public Dog(String name, String color, double height, double weight, int age, String stateOfMind) {
        super(name, color, weight);
        this.height = height;
        this.age = age;
        this.stateOfMind = stateOfMind;

        numberOfDogs++;
    }

//Methods

    public static int getNumberOfDogs() {
        return numberOfDogs;
    }

    public static void setNumberOfDogs(int numberOfDogs) {
        Dog.numberOfDogs = numberOfDogs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStateOfMind() {
        return stateOfMind;
    }

    public String take() {
        return "Bolinha";
    }

    public String interact(String action) {

        switch (action) {
            case "carinho":
                this.stateOfMind = "Feliz";
                break;
            case "vai dormir!":
                this.stateOfMind = "Bravo";
                break;
            case "Pisar na patinha":
                this.stateOfMind = "Triste";
            default:
                this.stateOfMind = "Neutro";
        }

        return stateOfMind;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public void sound() {
        System.out.println("AU AU");
    }
}