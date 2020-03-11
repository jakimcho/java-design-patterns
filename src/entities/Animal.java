package entities;

import entities.visitors.AnimalVisitor;

/**
 * @author yakimfb
 * @since 11.03.20
 **/
public interface Animal
{
    void speak();

    /*
        The bellow three methods:
            * void speak( Dog dog )
            * void speak( Cat cat )
            * void speak( Animal animal );
        are just to proof that double dispatch is not supported in java
    */
    void speak( Dog dog );

    void speak( Cat cat );

    void speak( Animal animal );

    void apply( AnimalVisitor animalVisitor );
}
