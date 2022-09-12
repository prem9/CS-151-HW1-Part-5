package com.example;

/**
 * Hello world!
 *
 */
public class Whale extends Animal 
{

    Whale(String name, String type, int age, String gender, String environment, double speed) {
        super(name, type, age, gender, environment, speed);
        //TODO Auto-generated constructor stub
        
    }

    @Override
    public void swim() {
        // TODO Auto-generated method stub
        System.out.println("swim");
    }
    public String toString(Animal est)
    {
        String animalInfo = "Animal Info: " + est.getAnimalType() + ", " + est.getAnimalName() + ", " + est.getEnvironment() + ", " + est.getGender() + ", "
        + est.getSpeed();
        return animalInfo;
    }
   
    
}
