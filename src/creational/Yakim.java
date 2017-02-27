package creational;

public class Yakim {
	private SingleTon portfail;
	
	public Yakim(){
		this.portfail = SingleTon.getPortfail();
	}

	public SingleTon getPortfail() {
		return portfail;
	}

	public void setPortfail(SingleTon portfail) {
		this.portfail = portfail;
	}
	
	

}
