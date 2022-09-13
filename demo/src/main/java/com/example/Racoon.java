package com.example;

/**
 * sets up Racoon class
 *
 */
public class Racoon extends Animal
{

    Racoon(String name, String type, int age, String gender, String environment, double speed) {
        super(name, type, age, gender, environment, speed);
        //TODO Auto-generated constructor stub
    }

    
    
    public void walk()
    {
        System.out.println( "walks" );
    }



    @Override
    public void scratch() {
        // TODO Auto-generated method stub
        System.out.println("scratch");
    }
    public String toString(Animal est)
    {
        String animalInfo = "Animal Info: " + est.getAnimalType() + ", " + est.getAnimalName() + ", " + est.getEnvironment() + ", " + est.getGender() + ", "
        + est.getSpeed();
        return animalInfo;
    }
}
