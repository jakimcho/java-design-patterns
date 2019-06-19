package entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Person
{
    private String firstName;
    private String sirName;
    private Date birthDate;
    private String gender;


    public String getSirName()
    {
        return sirName;
    }

    public void setSirName( String sirName )
    {
        this.sirName = sirName;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate( Date birthDate )
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
        LocalDate ldBirthday = birthDate.toInstant()
                                        .atZone( ZoneId.systemDefault() )
                                        .toLocalDate();
        Period p = Period.between( ldBirthday,
                                   today );
        return p.getYears();
    }
}
