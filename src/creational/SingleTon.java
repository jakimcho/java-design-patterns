package creational;


public class SingleTon {

	public static SingleTon getPortfail(){
		if (portfail == null){
			portfail = new SingleTon();
		}
		
		return portfail;
	}
	
	private static SingleTon portfail;
	
	private SingleTon(){
		this.balance = 10F;
	}
	private float balance;
	
	public void addMoney(float sum){
		this.balance += sum;
	}
	
	public void takeMoney(float sum){
		this.balance -= sum;
	}
	
	public float getCurrentBalance(){
		return this.balance;
	}
}
