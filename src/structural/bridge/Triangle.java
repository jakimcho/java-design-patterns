package structural.bridge;

public class Triangle extends Shape {
	
	public Triangle(ShapeBrushAPI shapeBrush) {
		this(10, 20, 60, shapeBrush);
	}
	
	public Triangle(int a, int b, int c, ShapeBrushAPI shapeBrush) {
		super(shapeBrush);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	int a, b, c;

	@Override
	public void draw() {
		System.out.println("Drawing " + this + " with brush " + this.getBrush());

	}

	@Override
	public void deleteDraw() {
		System.out.println("Deleting " + this + " with brush " + this.getBrush());

	}
	
	@Override
	public String toString(){
		
		return String.format(this.getClass().getName() + 
							" with a = %d, b = %d, c = %d ", 
							this.a, this.b, this.c);
	}

}
