package creational.singleton;

// Not thread save
public class SingleTon {

	public static SingleTon getWallet(){
		if ( wallet == null){
			wallet = new SingleTon();
		}
		
		return wallet;
	}
	
	private static SingleTon wallet;
	
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
