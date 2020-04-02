package creational.singleton;

import structural.decorator.Rectangle;
import structural.decorator.Shape;
import structural.decorator.Triangle;

public class  Action {

	public static void main(String[] args) {
		Yakim yakim = new Yakim();
		Ani ani = new Ani();
		System.out.println( "Protfail curr balans " + Singleton.getWallet().getCurrentBalance());
		yakim.getPortfail().addMoney(45.5F);
		System.out.println("Ani gleda v porfail ima " + ani.getPortfail().getCurrentBalance());
		ani.getPortfail().takeMoney(25.45F);
		System.out.println("Yakim gleda v porfail ima " + yakim.getPortfail().getCurrentBalance());

		System.out.println("Time for Peinting");

		Shape triangle = new Triangle();
		Shape rectangle = new Rectangle();
		
		
		if (rectangle instanceof Shape){
			System.out.println("This is a shape right");
			System.out.println("The object class name is " + rectangle.getClass().getName());
			((Triangle) rectangle).calculateTraingle();
		}
		
		((Triangle) rectangle).calculateTraingle();		

	}

}
