package entities;

import java.util.List;

public class Company
{
    private String name;
    private List<Person> employees;
    private Person manager;

    public void addEmployee(Person employee){
        this.employees.add( employee );
    }

    public int getEmployeesNumber(){
        return this.employees.size();
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public List<Person> getEmployees()
    {
        return employees;
    }

    public void setEmployees( List<Person> employees )
    {
        this.employees = employees;
    }

    public Person getManager()
    {
        return manager;
    }

    public void setManager( Person manager )
    {
        this.manager = manager;
    }
}

