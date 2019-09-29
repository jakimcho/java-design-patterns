package tips_n_trics;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class SwitchCaseMap
{
    public static void main( String[] args ) throws Exception
    {
        Map<String, Callable<String>> conditions = new HashMap<>();
        String bdate = "11/12/2019";

        conditions.put( "name",
                        () ->
                        {
                            System.out.println( "Will get user name" );
                            return "Georgi";
                        } );

        conditions.put( "sir name",
                        () ->
                        {
                            System.out.println( "Will get user sir name" );
                            return "Ivanov";
                        } );
        conditions.put( " ",
                        () ->
                        {
                            System.out.println( "Will get user sir name" );
                            return bdate;
                        } );

        String res = conditions.get( "name" )
                               .call();
        System.out.println( "Get result: " + res );


    }
}
