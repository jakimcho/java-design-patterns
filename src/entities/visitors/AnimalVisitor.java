package entities.visitors;

import entities.Cat;
import entities.Dog;

/**
 * @author yakimfb
 * @since 11.03.20
 **/
public interface AnimalVisitor
{
    void visit( Dog animal );

    void visit( Cat animal );
}
