package structural.decorator;

public class ColorDecorator implements ShapeDecorator {

	private String color;
	private Shape shape;
	
	public ColorDecorator(Shape shape, String color){
		this.shape = shape;
		this.color = color;
	}
	
	public ColorDecorator(Shape shape){
		this(shape, "red");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		shape.draw();
		System.out.println("It is drawn with color " + this.color);
	}

}
