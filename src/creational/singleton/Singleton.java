package creational.singleton;

// Not thread save
public class Singleton
{

    private long createdTime;
    private static long createdInstances = 0;

    public static Singleton getWallet()
    {
        if ( wallet == null )
        {
            System.out.println(
                    "###### And the thread got first unsaved singleton instance is... " + Thread.currentThread()
                                                                                                .getId() );
            wallet = new Singleton();
        }

        return wallet;
    }

    private static Singleton wallet;

    private Singleton()
    {
        createdInstances++;
        this.createdTime = System.nanoTime();
        this.balance = 10F;
    }

    private float balance;

    public void addMoney( float sum )
    {
        this.balance += sum;
    }

    public void takeMoney( float sum )
    {
        this.balance -= sum;
    }

    public long getCreatedTime()
    {
        return this.createdTime;
    }

    public float getCurrentBalance()
    {
        return this.balance;
    }

    public long getCreatedInstancesNumber()
    {
        return createdInstances;
    }
}
