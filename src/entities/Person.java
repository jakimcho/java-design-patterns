package entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Person
{
    private String firstName;
    private String sirName;
    private LocalDate birthDate;
    private String gender;


    @Override
    public String toString()
    {
        return "Person{" +
               "firstName='" + firstName + '\'' +
               ", sirName='" + sirName + '\'' +
               ", birthDate=" + birthDate +
               ", gender='" + gender + '\'' +
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

    public String getGender()
    {
        return gender;
    }

    public void setGender( String gender )
    {
        this.gender = gender;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
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
