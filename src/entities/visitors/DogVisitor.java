package entities.visitors;

import entities.Cat;
import entities.Dog;

/**
 * @author yakimfb
 * @since 11.03.20
 **/
public class DogVisitor
        implements AnimalVisitor
{
    @Override
    public void visit( Dog animal )
    {
        System.out.println( "I'm a dog! Lets sniff each others buts!" );
    }

    @Override
    public void visit( Cat animal )
    {
        System.out.println( "I'm a dog! I'll eat you cat" );
    }
}
