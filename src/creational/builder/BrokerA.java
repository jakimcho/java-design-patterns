package creational.builder;

public class BrokerA extends AbstactBroker {
	
	public BrokerA(String name, String surName, String streetName, String town, String country, int age) {
		super();
		this.name = name;
		this.surName = surName;
		this.streetName = streetName;
		this.town = town;
		this.country = country;
		this.age = age;
	}
	
	@Override
	public String toString(){
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("I'm A Broker A and this are my fields:")
		.append("\nName: ").append(this.name)
		.append("\nSur Name: ").append(this.surName)
		.append("\nStreet Name: ").append(this.streetName)
		.append("\nTown: ").append(this.town)
		.append("\nCountry: ").append(this.country)
		.append("\nAge: ").append(this.age);
		
		return strBuilder.toString();
	}

}
