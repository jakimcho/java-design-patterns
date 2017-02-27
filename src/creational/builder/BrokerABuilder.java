package creational.builder;

public class BrokerABuilder extends AbstractBrokerBuilder<BrokerABuilder, BrokerA> {

	@Override
	public BrokerA build() {
		
		return new BrokerA( name, 
							surName, 
							streetName, 
							town, 
							country, 
							age);
	}

}
