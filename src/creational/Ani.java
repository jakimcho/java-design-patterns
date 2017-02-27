package creational;

public class Ani {
	
	private SingleTon portfail;
	
	public Ani(){
		this.portfail = SingleTon.getPortfail();
	}

	public SingleTon getPortfail() {
		return portfail;
	}

	public void setPortfail(SingleTon portfail) {
		this.portfail = portfail;
	}
	
	

}
