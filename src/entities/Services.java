package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.StrictMath.abs;

public class Services
{

    public static Person generatePerson()
    {
        Person person = new Person();

        person.setFirstName( getRandomFirstName() );
        person.setSirName( getRandomSirName() );
        person.setGender( getRandomGender() );
        person.setBirthDate( getRandomDate() );
        return person;
    }


    public static List<Person> generatePeople( int peopleNumber )
    {
        List<Person> people = new ArrayList<>( peopleNumber );
        for ( int i = 0; i < peopleNumber; i++ )
        {
            people.add( generatePerson() );
        }

        return people;
    }


    public static Company generateCompany( int employeesNumber )
    {
        Company company = new Company();
        company.setName( getRandomCompanyName() );
        List<Person> employees = generatePeople( employeesNumber );
        company.setEmployees( employees );
        Random rand = new Random();
        int index = rand.nextInt( employees.size() );
        company.setManager( employees.get( index ) );
        return company;
    }

    public static List<Company> generateCompanies( int companiesNumber )
    {

        List<Company> companies = new ArrayList<>( companiesNumber );
        for ( int i = 0; i < companiesNumber; i++ )
        {
            int employeesNumber = createRandomIntBetween(2, 50);
            companies.add( generateCompany( employeesNumber ));
        }

        return companies;
    }

    ///////////////////////////////////////////////////////////

    private static String getRandomCompanyName()
    {
        return getRandomElement( Data.companiesNames );
    }

    private static String getRandomGender()
    {
        return getRandomElement( Data.genders );
    }

    private static String getRandomSirName()
    {
        return getRandomElement( Data.sirNames );
    }

    private static String getRandomFirstName()
    {
        return getRandomElement( Data.firstNames );
    }

    private static String getRandomElement( String[] arrData )
    {
        Random rand = new Random();
        int index = rand.nextInt( arrData.length );
        return arrData[index];
    }

    private static int createRandomIntBetween( int start,
                                               int end )
    {
        return start + (int) Math.round( Math.random() * ( end - start ) );
    }

    private static LocalDate getRandomDate()
    {
        int day = createRandomIntBetween( 1,
                                          28 );
        int month = createRandomIntBetween( 1,
                                            12 );
        int year = createRandomIntBetween( 1900,
                                           2000 );
        return LocalDate.of( year,
                             month,
                             day );
    }

}
