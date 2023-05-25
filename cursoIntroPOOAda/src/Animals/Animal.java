package Animals;

public abstract class Animal {

    //Attributes
    String name;
    String color;
    double height;
    double weight;
    int age;
    protected String stateOfMind;

    public Animal(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
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

    public void setStateOfMind(String stateOfMind) {
        this.stateOfMind = stateOfMind;
    }

    //Methods
    void eat() {
    }

    void sleep() {
    }

    public abstract void sound();
}