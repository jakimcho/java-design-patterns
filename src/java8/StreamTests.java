package java8;

import entities.Company;
import entities.Person;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
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
        System.out.println( "\n---------- After Sort --------" );
        sortCompaniesByPeopleNumber( companies );

        System.out.println( "\n---------- Get all employees --------" );

        printAllEmployees( companies );

        System.out.println( "\n---------- Get a company with more than 30 employees --------" );

        getFirstCompanyWithMoreThan30Employees( companies );

        System.out.println( "\n---------- Get a random company with more than 30 employees --------" );

        getFirstRandomCompanyWithMoreThan30Employees( companies );

        System.out.println( "\n---------- Little predicates --------" );
        someMatchings( companies );
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

    public static void getFirstCompanyWithMoreThan30Employees( final List<Company> companies )
    {
        companies.stream()
                 .filter( company -> company.getEmployeesNumber() > 30 )
                 .findFirst()
                 .ifPresent( System.out::println );
    }

    public static void getFirstRandomCompanyWithMoreThan30Employees( final List<Company> companies )
    {
        companies.parallelStream()
                 .filter( company -> company.getEmployeesNumber() > 30 )
                 .findAny()
                 .ifPresent( System.out::println );
    }

    public static void someMatchings( final List<Company> companies )
    {
        Predicate<Company> moreThan30Employees = company -> company.getEmployeesNumber() > 30;

        boolean areAllCompaniesWithMoreThan30Employees = companies.parallelStream()
                                                                  .allMatch( moreThan30Employees );

        boolean areThereAreCompaniesWithMoreThan30Employees = companies.parallelStream()
                                                                       .anyMatch( moreThan30Employees );

        boolean areThereNoCompaniesWithMoreThan30Employees = companies.parallelStream()
                                                                      .noneMatch( moreThan30Employees );


        System.out.println( "All Companies have more than 30 employees: " + areAllCompaniesWithMoreThan30Employees );
        System.out.println(
                "Some Companies have more than 30 employees: " + areThereAreCompaniesWithMoreThan30Employees );
        System.out.println( "No Companies have more than 30 employees: " + areThereNoCompaniesWithMoreThan30Employees );
    }

}
