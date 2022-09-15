package com.example;

/**
 * sets up animal
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
    public void move()
    {
        System.out.println("Moving");
    }
    public void sound()
    {
        System.out.println("Sound");
    }
    public void eat()
    {
        System.out.println("eating");
    }
    public void sleep()
    {
        System.out.println("sleeping");
    }
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
     * @param animalTypeSet sets animal type
     */
    public void setAnimalType(String animalTypeSet)
    {
        animalType = animalTypeSet;
    }
    /**
     * @return retrieves animal type
     */
    public String getAnimalType()
    {
        return animalType;
    }
    /**
     * @param animalNameSet sets animal name
     */
    public void setAnimalName(String animalNameSet)
    {
        animalName = animalNameSet;
    }
    /**
     * @return retrieves animal name
     */
    public String getAnimalName()
    {
        return animalName;
    }
    /**
     * @param ageSet sets age of animal
     */
    public void setAge(int ageSet)
    {
        age = ageSet;
    }
    /**
     * @return retrieves age of animal
     */
    public int getAge()
    {
        return age;
    }
    /**
     * @param genderSet sets gender of animal
     */
    public void setGender(String genderSet)
    {
        gender = genderSet;
    }
    /**
     * @return retrieves gender of animal
     */
    public String getGender()
    {
        return gender;
    }
    /**
     * @param environmentSet sets animal's environment
     */
    public void setEnvironment(String environmentSet)
    {
        environment = environmentSet;
    }
    /**
     * @return retrieves animal's environment
     */
    public String getEnvironment()
    {
        return environment;
    }
    /**
     * @param speedSet sets animal's speed
     */
    public void setSpeed(double speedSet)
    {
        speed = speedSet;
    }
    /**
     * @return retrieves animal's speed
     */
    public double getSpeed()
    {
        return speed;
    }
    /**
     * @return retrieves all the information of the animal in a string
     */
    public String toString()
    {
        String animalInfo = "Animal Info: " + this.getAnimalType() + ", " + this.getAnimalName() + ", " + this.getEnvironment() + ", " + this.getGender() + ", "
        + this.getSpeed();
        return animalInfo;
    }

}
