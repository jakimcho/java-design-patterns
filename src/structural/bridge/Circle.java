package structural.bridge;

import java.awt.Point;

public class Circle extends Shape {
	int radius;
	Point center;

	public Circle(ShapeBrushAPI shapeBrush) {
		this(20, new Point(50, 50), shapeBrush);
	}
	
	public Circle(int radius, Point center, ShapeBrushAPI shapeBrush) {
		super(shapeBrush);
		this.center = center;
		this.radius = radius;
	}

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
		return this.getClass().getName() + " with center " + this.center + " and radius " + this.radius;
	}

}
