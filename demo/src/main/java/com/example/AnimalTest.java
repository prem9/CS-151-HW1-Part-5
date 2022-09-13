package com.example;

/**
 * tests all the code of animal
 *
 */
public class AnimalTest
{
    
    public static void main( String[] args )
    {
        Animal dog1 = new Dog("Test", "Dog", 11, "male", "domesticated", 0);
        Animal whale1 = new Whale("Test1", "Whale", 11, "male", "water", 0);
        Animal cat1 = new Cat("Test2", "Cat", 11, "male", "domesticated", 0);
        Animal racoon1 = new Racoon("Test1", "Racoon", 11, "male", "Land", 0);

        System.out.println("Dog");
        dog1.greetHuman();
        System.out.println("Whale");
        whale1.greetHuman();
        System.out.println("Cat");
        cat1.greetHuman();
        System.out.println("Racoon");
        racoon1.greetHuman();

        System.out.println();

        System.out.println("Dog");
        dog1.walk();
        System.out.println("Whale");
        whale1.walk();
        System.out.println("Cat");
        cat1.walk();
        System.out.println("Racoon");
        racoon1.walk();
        
        System.out.println();

        System.out.println("Dog");
        dog1.scratch();
        System.out.println("Whale");
        whale1.scratch();
        System.out.println("Cat");
        cat1.scratch();
        System.out.println("Racoon");
        racoon1.scratch();
        
        System.out.println();

        System.out.println("Dog");
        dog1.swim();
        System.out.println("Whale");
        whale1.swim();
        System.out.println("Cat");
        cat1.swim();
        System.out.println("Racoon");
        racoon1.swim();

        System.out.println();

        System.out.println(dog1.toString());
        System.out.println(whale1.toString());
        System.out.println(cat1.toString());
        System.out.println(racoon1.toString());
    }
    

}
