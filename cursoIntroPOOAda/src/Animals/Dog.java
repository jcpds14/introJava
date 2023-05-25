package Animals;

public class Dog {
//Attributes
    private String name;
    private String color;
    private double height;
    private double weight;
    private int age;
    private String stateOfMind;

    //Default constructor
    public Dog(){}

    //Aditionals constructors
    public Dog(String name, String color, double height, double weight, int age, String stateOfMind) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.stateOfMind = stateOfMind;
    }

    //Methods
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

    public void eat() {
    }//Method - in this case, is public, don't use return value, don't have parameters

    public void bark() {
        System.out.println("AU AU");
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


//        if (action.equals("carinho")){
//            this.stateOfMind = "Feliz";
//        }else if (action.equals("vai dormir!")){
//            this.stateOfMind = "Bravo";
//        }else{
//            this.stateOfMind = "Neutro";
//        }
        return stateOfMind;
    }

}