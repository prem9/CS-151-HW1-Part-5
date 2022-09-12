package com.example;

/**
 * Hello world!
 *
 */
public class Animal  implements Domesticated, Scratcher, Swimmer
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
    /**
     * @param name
     * @param type
     * @param age
     * @param gender
     * @param environment
     * @param speed
     */
    Animal(String name, String type, int age, String gender, String environment, double speed)
    {
        this.animalName = name;
        this.animalType = type;
        this.age = age;
        this.gender = gender;
        this.environment = environment;
        this.speed = speed;
    }
    /**
     * 
     */
    public void greetHuman()
    {
        
    }
    /**
     * 
     */
    public void walk()
    {
        
    }
    /**
     * 
     */
    public void scratch()
    {

    }
    /**
     * 
     */
    public void swim()
    {

    }
    /**
     * @param animalTypeSet
     */
    public void setAnimalType(String animalTypeSet)
    {
        animalType = animalTypeSet;
    }
    /**
     * @return
     */
    public String getAnimalType()
    {
        return animalType;
    }
    /**
     * @param animalNameSet
     */
    public void setAnimalName(String animalNameSet)
    {
        animalName = animalNameSet;
    }
    /**
     * @return 
     */
    public String getAnimalName()
    {
        return animalName;
    }
    /**
     * @param ageSet
     */
    public void setAge(int ageSet)
    {
        age = ageSet;
    }
    /**
     * @return
     */
    public int getAge()
    {
        return age;
    }
    /**
     * @param genderSet
     */
    public void setGender(String genderSet)
    {
        gender = genderSet;
    }
    /**
     * @return
     */
    public String getGender()
    {
        return gender;
    }
    /**
     * @param environmentSet
     */
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
    public String toString()
    {
        String animalInfo = "Animal Info: " + this.getAnimalType() + ", " + this.getAnimalName() + ", " + this.getEnvironment() + ", " + this.getGender() + ", "
        + this.getSpeed();
        return animalInfo;
    }

}
