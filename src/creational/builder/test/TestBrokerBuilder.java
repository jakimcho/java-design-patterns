package creational.builder.test;

import creational.builder.AbstactBroker;
import creational.builder.AbstractBrokerBuilder;
import creational.builder.BrokerABuilder;
import creational.builder.BrokerBBuilder;

public class TestBrokerBuilder {

	public static void main(String[] args) {
		AbstactBroker broker1;
		AbstactBroker broker2;
		
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
		
		System.out.println("\nBroker 1 " + broker1);
		System.out.println("\nBroker 2 " + broker2);

	}

}
