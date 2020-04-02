package creational.singleton;

/**
 * @author yakimfb
 * @since 2.04.20
 **/
public enum SingletonEnum
{
    INSTANCE;

    private final long createdTime;
    private long createdInstances = 0;

    SingletonEnum()
    {
        System.out.println(
                "###### And the thread got first safe singleton enum instance is... " + Thread.currentThread()
                                                                                              .getId() );
        this.createdTime = System.nanoTime();
        createdInstances++;
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
