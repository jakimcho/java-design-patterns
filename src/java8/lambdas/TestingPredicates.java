package java8.lambdas;

import entities.Job;
import entities.Person;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static entities.Gender.*;
import static entities.Services.generatePeople;

/**
 * @author yakimfb
 * @since 28.02.20
 **/
public class TestingPredicates
{
    public static void main( String[] args )
    {
        List<Person> people = generatePeople( 20 );
        Person thePerson = extractPerson( people,
                                          person -> person.getJob()
                                                          .equals( Job.TESTER ) && person.getGender()
                                                                                         .equals( TRANS ) );
        System.out.println( "The generated people are:" );
        people.stream()
              .forEach( System.out::println );
        System.out.println( "\n#########################\n" );
        System.out.println( "The first found Tester is: " +
                            thePerson );
        System.out.println( "\n#########################\n" );
        System.out.println( "Finding all GAYs:" );
        processPerson( people,
                       person ->
                               !( person.getGender()
                                        .equals( MALE ) || person.getGender()
                                                                 .equals( FEMALE ) ),
                       System.out::println );

        System.out.println( "Vsichki 0f4ri" );
        people.stream()
              .filter( of4r )
              .forEach( System.out::println );

        System.out.println( "Vsichki Dev" );
        people.stream()
              .filter( dev )
              .forEach( System.out::println );

        if ( people.get( 1 )
                   .is( of4r ) )
        {
            System.out.println( "Ti si of4r" );
        } else
        {
            System.out.println( "Ti ne si of4r" );
        }
    }

    static Person extractPerson( List<Person> people,
                                 Predicate<Person> criteria )
    {
        for ( Person person : people )
        {
            if ( criteria.test( person ) )
            {
                return person;
            }
        }

        return null;
    }

    static void processPerson( List<Person> people,
                               Predicate<Person> predicate,
                               Consumer<Person> action )
    {
        people.forEach( person ->
                        {
                            if ( predicate.test( person ) )
                            {
                                action.accept( person );
                            }
                        } );
    }

    static Predicate<Person> of4r = person -> person.getJob()
                                                    .equals( Job.SHEPARD );

    static Predicate<Person> dev = person -> person.getJob()
                                                    .equals( Job.DEVELOPER );
}