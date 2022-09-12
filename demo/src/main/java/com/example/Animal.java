package com.example;

/**
 * Hello world!
 *
 */
public class Animal  implements Domesticated 
{
    private String animalType;
    private String animalName;
    private int age;
    private String gender;
    private String environment;
    private double speed;
    /*public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }*/
    Animal(String name)
    {
        this.animalName = name;
    }

    public void greetHuman()
    {
        System.out.println( "Hello World!" );
    }
    public void walk()
    {
        System.out.println( "%s "+animalType +"walking" );
    }

    public void setAnimalType(String animalTypeSet)
    {
        animalType = animalTypeSet;
    }
    public String getAnimalType()
    {
        return animalType;
    }
    public void setAnimalName(String animalNameSet)
    {
        animalName = animalNameSet;
    }
    public String getAnimalName()
    {
        return animalName;
    }
    public void setAge(int ageSet)
    {
        age = ageSet;
    }
    public int getAge()
    {
        return age;
    }
    public void setGender(String genderSet)
    {
        gender = genderSet;
    }
    public String getGender()
    {
        return gender;
    }
    public void setEnvironment(String environmentSet)
    {
        environment = environmentSet;
    }
    public String getEnvironment()
    {
        return environment;
    }
    public void setSpeed(double speedSet)
    {
        speed = speedSet;
    }
    public double getSpeed()
    {
        return speed;
    }

}
