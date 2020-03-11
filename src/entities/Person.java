package entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.function.Predicate;

public class Person
{
    private String firstName;
    private String sirName;
    private LocalDate birthDate;
    private Gender gender;
    private Job job;

    @Override
    public String toString()
    {
        return "Person{" +
               "firstName='" + firstName + '\'' +
               ", sirName='" + sirName + '\'' +
               ", birthDate=" + birthDate +
               ", gender=" + gender +
               ", job=" + job +
               '}';
    }

    public String getSirName()
    {
        return sirName;
    }

    public void setSirName( String sirName )
    {
        this.sirName = sirName;
    }

    public LocalDate getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate( LocalDate birthDate )
    {
        this.birthDate = birthDate;
    }

    public Gender getGender()
    {
        return gender;
    }

    public void setGender( Gender gender )
    {
        this.gender = gender;
    }

    public Job getJob()
    {
        return job;
    }

    public void setJob( Job job )
    {
        this.job = job;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    public boolean is( Predicate<Person> predicate )
    {
        return predicate.test( this );
    }

    public int getAge()
    {

        LocalDate today = LocalDate.now();
        LocalDate ldBirthday = birthDate;
        Period p = Period.between( ldBirthday,
                                   today );
        return p.getYears();
    }
}
