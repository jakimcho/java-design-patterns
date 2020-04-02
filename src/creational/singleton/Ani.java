package creational.singleton;

public class Ani {
	
	private SingleTon portfail;
	
	public Ani(){
		this.portfail = SingleTon.getWallet();
	}

	public SingleTon getPortfail() {
		return portfail;
	}

	public void setPortfail(SingleTon portfail) {
		this.portfail = portfail;
	}
	
	

}
