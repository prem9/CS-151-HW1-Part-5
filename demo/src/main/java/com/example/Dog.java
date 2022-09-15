package com.example;

/**
 * Sets up Dog Class
 *
 */
public class Dog extends Animal
{

    Dog(String name, String type, int age, String gender, String environment, double speed) {
        super(name, type, age, gender, environment, speed);
        //TODO Auto-generated constructor stub
    }

    public void Bark()
    {
        System.out.println( "Bark!" );
    }
    public void greetHuman()
    {
        System.out.println( "Hello Hooman!" );
    }
    public void walk()
    {
        System.out.println( "walks" );
    }

}
