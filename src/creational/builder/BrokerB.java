package creational.builder;

public class BrokerB extends AbstactBroker {

	private float salary;
	private boolean hasClients;
	private String gender;

	public BrokerB(String name, String surName, String streetName, String town, String country, int age, float salary,
			boolean hasClients, String gender) {
		super();
		this.name = name;
		this.surName = surName;
		this.streetName = streetName;
		this.town = town;
		this.country = country;
		this.age = age;
		this.salary = salary;
		this.hasClients = hasClients;
		this.gender = gender;
	}

	public float getSalary() {
		return salary;
	}

	public boolean hasClients() {
		return hasClients;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString(){
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("I'm A Broker B and this are my fields:")
		.append("\nName: ").append(this.name)
		.append("\nSur Name: ").append(this.surName)
		.append("\nStreet Name: ").append(this.streetName)
		.append("\nTown: ").append(this.town)
		.append("\nCountry: ").append(this.country)
		.append("\nSalary: ").append(this.salary)
		.append("\nAge: ").append(this.age)
		.append("\nDo I have clients: ").append(this.hasClients)
		.append("\nGender: ").append(this.gender);
		
		return strBuilder.toString();
	}

}
