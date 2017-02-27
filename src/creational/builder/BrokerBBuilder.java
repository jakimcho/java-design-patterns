package creational.builder;

public class BrokerBBuilder extends AbstractBrokerBuilder<BrokerBBuilder, BrokerB> {
	
	private float salary;
	private boolean hasClients;
	private String gender;

	@Override
	public BrokerB build() {
		
		return new BrokerB( name, 
							surName, 
							streetName, 
							town, 
							country, 
							age,
							salary,
							hasClients,
							gender);
	}
	
	public BrokerBBuilder withSalary(float salary){
		this.salary = salary;
		return  this;
	}

	public BrokerBBuilder hasClients(boolean hasClients){
		this.hasClients = hasClients;
		return this;
	}
	
	public BrokerBBuilder withGenderType(String gender){
		this.gender = gender;
		return this;
	}

}
