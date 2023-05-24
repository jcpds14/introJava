package Animals;

public class Dog {

    public String name;
    public String cor;
    public double height;
    public double weight;
    public int age;

    public String stateOfMind;

    public void eat(){}//Method - in this case, is public, don't use return value, don't have parameters
    public void bark(){
        System.out.println("AU AU");
    }
    public String take(){
        return "Bolinha";
    }
    public String interact(String action){
        if (action.equals("carinho")){
            this.stateOfMind = "Feliz";
        }else if (action.equals("vai dormir!")){
            this.stateOfMind = "Bravo";
        }else{
            this.stateOfMind = "Neutro";
        }
        return stateOfMind;
    }

}