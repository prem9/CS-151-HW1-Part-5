package com.example;

/**
 * Sets up Cat class
 *
 */
public class Cat extends Animal 
{

    Cat(String name, String type, int age, String gender, String environment, double speed) {
        super(name, type, age, gender, environment, speed);
        //TODO Auto-generated constructor stub
    }

    
    public void greetHuman()
    {
        System.out.println( "Hello Hooman!" );
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
}
