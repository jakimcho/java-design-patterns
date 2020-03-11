package entities.visitors;

import entities.Cat;
import entities.Dog;

/**
 * @author yakimfb
 * @since 11.03.20
 **/
public class CatVisitor
        implements AnimalVisitor
{
    private final static Cat CAT = new Cat();

    @Override
    public void visit( Dog dog )
    {
        System.out.println( "I'm a cat! You won't catch me you stupid dog" );
    }

    @Override
    public void visit( Cat cat )
    {
        System.out.println( "I'm a cat! Lets play" );
    }
}
