package creational.singleton;

/**
 * @author yakimfb
 * @since 2.04.20
 **/

// Thread safe though synchronized block

public class ThreadSaveSingleton
{
    private static volatile ThreadSaveSingleton instance;
    private final long createdTime;
    private static long createdInstances = 0;

    private ThreadSaveSingleton()
    {
        createdInstances++;
        this.createdTime = System.nanoTime();
    }

    public static ThreadSaveSingleton getInstance()
    {
        if ( instance != null ){
            return instance;
        }

        synchronized ( ThreadSaveSingleton.class )
        {
            if ( instance == null )
            {
                System.out.println(
                        "###### And the thread got first safe singleton instance is... " + Thread.currentThread()
                                                                                                 .getId() );
                instance = new ThreadSaveSingleton();
            }

            return instance;
        }
    }

    public long getCreatedTime()
    {
        return this.createdTime;
    }

    public long getCreatedInstancesNumber()
    {
        return createdInstances;
    }

}
