package structural.decorator;

public class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("I'm drawing a Traingle");

	}
	
	public void calculateTraingle(){
		System.out.println("Im calculating the perimeter");
	}

}
