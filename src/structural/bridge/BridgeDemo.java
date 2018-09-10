package structural.bridge;

import java.awt.Point;

public class BridgeDemo {

	public static void main(String[] args) {
		Shape myShape = new Triangle(10, 20, 30, new RedMarker());
		Shape myShape1 = new Circle(50, new Point(20, 30), new Pencil());
		Shape myShape2 = new Circle(new RedMarker());
		
		System.out.println(myShape);
		System.out.println(myShape1);
		System.out.println(myShape2);
		
		myShape.draw();
		myShape1.draw();
		myShape2.draw();
		
		((RedMarker) myShape2.getBrush()).setMarkerTickness(5);
		myShape1.changeBrush(myShape2.getBrush());
		

		myShape1.draw();

	}

}
