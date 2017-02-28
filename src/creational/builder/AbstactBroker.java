package creational.builder;

public abstract class AbstactBroker {
	
	protected String name;
	protected String surName;
	protected String streetName;
	protected String town;
	protected String country;
	protected int age;
	
	public String getName() {
		return name;
	}

	public String getSurName() {
		return surName;
	}

	public String getStreetName() {
		return streetName;
	}

	public String getTown() {
		return town;
	}

	public String getCountry() {
		return country;
	}

	public int getAge() {
		return age;
	}
	
}
