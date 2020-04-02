package creational.singleton;

public class Yakim {
	private Singleton portfail;
	
	public Yakim(){
		this.portfail = Singleton.getWallet();
	}

	public Singleton getPortfail() {
		return portfail;
	}

	public void setPortfail( Singleton portfail) {
		this.portfail = portfail;
	}
	
	

}
