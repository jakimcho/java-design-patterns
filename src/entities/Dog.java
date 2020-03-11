package entities;

import entities.visitors.AnimalVisitor;

/**
 * @author yakimfb
 * @since 11.03.20
 **/
public class Dog
        implements Animal
{
    @Override
    public void speak()
    {
        System.out.println( "I'm a dog! Bauuu!" );
    }

    /*
        The bellow three methods:
            * void speak( Dog dog )
            * void speak( Cat cat )
            * void speak( Animal animal );
        are just to proof that double dispatch is not supported in java
    */
    @Override
    public void speak( Dog dog )
    {
        System.out.println( "I'm a dog! Lets sniff each others buts!" );
    }

    @Override
    public void speak( Cat cat )
    {
        System.out.println( "I'm a dog! I'll eat you cat" );
    }

    @Override
    public void speak( Animal a )
    {
        System.out.println( "I'm a dog! Not sure what are you" );
    }

    @Override
    public void apply( AnimalVisitor animalVisitor )
    {
        animalVisitor.visit( this );
    }

}
