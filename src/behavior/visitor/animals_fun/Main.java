package behavior.visitor.animals_fun;

import entities.Animal;
import entities.Cat;
import entities.Dog;
import entities.visitors.AnimalVisitor;
import entities.visitors.CatVisitor;
import entities.visitors.DogVisitor;

import java.util.logging.Logger;

/**
 * @author yakimfb
 * @since 11.03.20
 **/
public class Main
{
    private static Logger logger = Logger.getLogger( "Main.class" );
    public static void main( String[] args )
    {
        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println("\n***** Trying out single dispatch *********\n" );
        // Single Dispatch, known also as Polymorphism
        cat.speak();
        dog.speak();

        // Double dispatch does not work :(
        System.out.println("\n***** Trying out double dispatch *********\n" );
        cat.speak( dog );
        dog.speak( cat );

        //Time for visitor
        System.out.println("\n***** Trying out the visitor pattern *********\n" );
        AnimalVisitor dogVisitor = new DogVisitor();
        AnimalVisitor catVisitor = new CatVisitor();
        cat.apply( dogVisitor );
        cat.apply( catVisitor );
        dog.apply( dogVisitor );
        dog.apply( catVisitor );
    }
}
