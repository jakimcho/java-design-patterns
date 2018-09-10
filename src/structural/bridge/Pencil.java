package structural.bridge;

public class Pencil implements ShapeBrushAPI {
	private String brushName;
	private String brushColor;
	private int brushTickness;
	
	public Pencil() {
		this.brushColor = "Black";
		this.brushName = "Pencil";
		this.brushTickness = 1;
	}

	public void setPencilTickness(int brushTickness){
		this.brushTickness = brushTickness;
	}
	
	public void setPencilColor(String brushColor){
		this.brushColor = brushColor;
	}
	
	@Override
	public String getBrushName() {
		return this.brushName;
	}

	@Override
	public int getBrushTickness() {
		return this.brushTickness;
	}

	@Override
	public String getBrushColor() {
		return this.brushColor;
	}
	
	@Override
	public String toString(){
		return String.format("Color = %s, Tickness = %d, Name = %s\n", 
							 this.brushColor, 
							 this.brushTickness, 
							 this.brushName);
	}

}
