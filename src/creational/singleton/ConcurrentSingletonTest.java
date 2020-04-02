package creational.singleton;

/**
 * @author yakimfb
 * @since 2.04.20
 **/
public class ConcurrentSingletonTest
{
    public static void main( String[] args )
    {
        runThreadSaveSingleton();
        runUnsavedThreadSaveSingleton();
        runSaveThreadEnumSingleton();

        try
        {
            Thread.sleep( 10000 );
        } catch ( InterruptedException e )
        {
            e.printStackTrace();
        }

        System.out.println( "Thread Safe instances: " + ThreadSaveSingleton.getInstance()
                                                                           .getCreatedInstancesNumber() );

        System.out.println( "Thread Unsafe instances: " + Singleton.getWallet()
                                                                   .getCreatedInstancesNumber() );

        System.out.println( "Thread safe enum instances: " + SingletonEnum.INSTANCE.getCreatedInstancesNumber() );
    }

    private static void runThreadSaveSingleton()
    {
        long startSignal = 2 * 1_000_000_000;
        long beginTime = System.nanoTime();
        for ( int i = 0; i < 10000; i++ )
        {
            Thread thread = new Thread( () ->
                                        {
                                            while ( System.nanoTime() - beginTime < startSignal )
                                            {
                                                //do nothing
                                            }

                                            System.out.println( "Hello from thread " + Thread.currentThread()
                                                                                             .getId()
                                                                + ". It get wallet instance created at: "
                                                                + ThreadSaveSingleton.getInstance()
                                                                                     .getCreatedTime() );
                                        } );

            thread.start();
        }

    }

    private static void runUnsavedThreadSaveSingleton()
    {
        long startSignal = 3 * 1_000_000_000;
        long beginTime = System.nanoTime();
        for ( int i = 0; i < 10000; i++ )
        {
            Thread thread = new Thread( () ->
                                        {
                                            while ( System.nanoTime() - beginTime < startSignal )
                                            {
                                                //do nothing
                                            }

                                            System.out.println( "Hello from unsaved thread " + Thread.currentThread()
                                                                                                     .getId()
                                                                + ". It get wallet instance created at: "
                                                                + Singleton.getWallet()
                                                                           .getCreatedTime() );
                                        } );

            thread.start();
        }


    }

    private static void runSaveThreadEnumSingleton()
    {
        long startSignal = 3 * 1_000_000_000;
        long beginTime = System.nanoTime();
        for ( int i = 0; i < 10000; i++ )
        {
            Thread thread = new Thread( () ->
                                        {
                                            while ( System.nanoTime() - beginTime < startSignal )
                                            {
                                                //do nothing
                                            }

                                            System.out.println( "Hello from safe thread " + Thread.currentThread()
                                                                                                  .getId()
                                                                + ". It get SingletonEnum instance created at: "
                                                                + SingletonEnum.INSTANCE.getCreatedTime() );
                                        } );

            thread.start();
        }


    }
}
