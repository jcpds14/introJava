package Stores;

import Animals.Animal;
import Animals.Dog;

public class PetShop {

    public void giveAShower(Animal animal){
        animal.setStateOfMind("Limpo");
    }
    public void shave(Dog dog){
        dog.setStateOfMind("Tosado");
    }
    public void sleepAtTheHotel(Animal animal){
        animal.setStateOfMind("Saudades");
    }
}