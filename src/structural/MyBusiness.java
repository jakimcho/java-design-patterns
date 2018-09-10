package structural;

public class MyBusiness
        implements Business
{
    @Override
    public void saveMoney()
    {
        System.out.println( "Saving money for future time" );
    }

    @Override
    public void investMoney( String stock )
    {
        System.out.println( "Investing money for in: " + stock );
    }
}
