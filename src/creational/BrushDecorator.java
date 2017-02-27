package creational;

public class BrushDecorator implements ShapeDecorator {

	private String brush;
	private Shape shape;
	
	public BrushDecorator(Shape shape, String brush){
		this.shape = shape;
		this.brush = brush;
	}
	
	public BrushDecorator(Shape shape){
		this(shape, "pen");
	}

	public String getBrush() {
		return brush;
	}

	public void setBrus(String brush) {
		this.brush = brush;
	}

	@Override
	public void draw() {
		shape.draw();
		System.out.println("It is drawn with brush " + this.brush);
	}

}
