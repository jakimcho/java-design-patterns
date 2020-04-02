package creational.singleton;

public class Ani {
	
	private Singleton portfail;
	
	public Ani(){
		this.portfail = Singleton.getWallet();
	}

	public Singleton getPortfail() {
		return portfail;
	}

	public void setPortfail( Singleton portfail) {
		this.portfail = portfail;
	}
	
	

}
