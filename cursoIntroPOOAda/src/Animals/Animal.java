package Animals;

public class Animal {

    //Attributes
    String name;
    String color;
     double height;
     double weight;
     int age;
     String stateOfMind;

    public Animal(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    //Methods
    void eat(){}
    void sleep(){}
    public void sound(){
        System.out.println("CRI CRI CRI");
    }
}