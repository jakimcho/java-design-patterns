package structural.bridge;

public class RedMarker implements ShapeBrushAPI {

	private String brushName;
	private String brushColor;
	private int brushTickness;
	
	public RedMarker(){
		this.brushColor = "Red";
		this.brushName = "Marker";
		this.brushTickness = 3;
	}
	
	public void setMarkerTickness(int brushTickness){
		this.brushTickness = brushTickness;
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
