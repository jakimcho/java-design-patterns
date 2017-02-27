package creational.builder;

public abstract class AbstractBrokerBuilder<Builder, Broker extends IBroker> {
	// the bare minimum a broker type class should have
	
	protected String name;
	protected String surName;
	protected String streetName;
	protected String town;
	protected String country;
	protected int age;
	
	public abstract Broker build();
	
	public static BrokerABuilder forBrokerA(){
		return new BrokerABuilder();
	}
	
	public static BrokerBBuilder forBrokerB() {
		return new BrokerBBuilder();
	}
	
	@SuppressWarnings("unchecked")
	public Builder withName(String name){
		this.name = name;
		return (Builder) this;
	}

	@SuppressWarnings("unchecked")
	public Builder withSurName(String surName){
		this.surName = surName;
		return (Builder) this;
	}
	
	@SuppressWarnings("unchecked")
	public Builder onStreetName(String streetName){
		this.streetName = streetName;
		return (Builder) this;
	}
	
	@SuppressWarnings("unchecked")
	public Builder inTown(String town){
		this.town = town;
		return (Builder) this;
	}
	
	@SuppressWarnings("unchecked")
	public Builder inCountry(String country){
		this.country = country;
		return (Builder) this;
	}
	
	@SuppressWarnings("unchecked")
	public Builder onAge(int age){
		this.age = age;
		return (Builder) this;
	}

}
