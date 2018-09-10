package structural.bridge;

public abstract class Shape {

	protected ShapeBrushAPI shapeBrush;
	
	public Shape(ShapeBrushAPI shapeBrush){
		this.shapeBrush = shapeBrush;
	}
	
	public abstract void draw();
	public abstract void deleteDraw();
	
	public void changeBrush(ShapeBrushAPI shapeBrush){
		this.shapeBrush = shapeBrush;
	}
	
	public ShapeBrushAPI getBrush(){
		return this.shapeBrush;
	}
}
