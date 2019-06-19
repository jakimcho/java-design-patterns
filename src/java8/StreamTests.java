package java8;

import entities.Company;
import entities.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static entities.Services.generateCompanies;

public class StreamTests
{
    public static void main( String[] args )
    {
        List<Company> companies = generateCompanies( 6 );
        companies.stream()
                 .forEach( company ->
                           {
                               System.out.printf( "\nCompany %s has %d employees.",
                                                  company.getName(),
                                                  company.getEmployees()
                                                         .size() );
                           } );
        System.out.println( "---------- After Sort --------" );
        sortCompaniesByPeopleNumber( companies );

        System.out.println( "---------- Get all employees --------" );

        printAllEmployees( companies );
    }

    public static void sortCompaniesByPeopleNumber( final List<Company> companies )
    {
        companies.stream()
                 .sorted( ( Comparator.comparingInt( Company::getEmployeesNumber )
                                      .reversed() ) )
                 .forEach( company ->
                           {
                               System.out.printf( "\nCompany %s has %d employees.",
                                                  company.getName(),
                                                  company.getEmployees()
                                                         .size() );
                           } );
    }

    public static void printAllEmployees( final List<Company> companies )
    {
        List<Person> data = companies.stream()
                                     .flatMap( c -> c.getEmployees()
                                                     .stream() )
                                     .sorted( Comparator.comparing( Person::getFirstName ) )
                                     .collect( Collectors.toList() );

        data.forEach( System.out::println );
    }

}
