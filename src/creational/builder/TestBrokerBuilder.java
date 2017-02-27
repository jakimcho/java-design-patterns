package creational.builder;

public class TestBrokerBuilder {

	public static void main(String[] args) {
		IBroker broker1;
		IBroker broker2;
		
		BrokerABuilder brokerABuilder = AbstractBrokerBuilder.forBrokerA();
		BrokerBBuilder brokerBBuilder = AbstractBrokerBuilder.forBrokerB();
		
		
		broker1 = brokerABuilder.withName("Gosho")
								.withSurName("Ivanov")
								.onAge(21)
								.onStreetName("Vasile Drumev 51")
								.inCountry("BG")
								.build();
		
		broker2 = brokerBBuilder.withName("Zoya")
								.withSurName("Gerkhan")
								.onAge(25)
								.onStreetName("Iohanse strase")
								.inCountry("DE")
								.withGenderType("Female")
								.withSalary(3549.45F)
								.build();
		
		System.out.println("Broker 1 " + broker1);
		System.out.println("Broker 2 " + broker2);

	}

}
