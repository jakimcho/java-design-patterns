package structural;

import structural.proxy.DynamicBusinessProxy;
import structural.proxy.StaticBusinessProxy;

import java.lang.reflect.Proxy;

public class TestIt
{
    public static void main( String[] args )
    {
        Business myBusiness = new MyBusiness();

        myBusiness.investMoney( "Petrol" );
        myBusiness.saveMoney();

        Business proxyB = new StaticBusinessProxy( myBusiness );

        proxyB.saveMoney();
        proxyB.investMoney( "Petrol" );

        DynamicBusinessProxy dproxy = new DynamicBusinessProxy( myBusiness );
        ClassLoader cl = TestIt.class.getClassLoader();
        Business dBusinessProxy = (Business) Proxy.newProxyInstance( cl,
                                                                     new Class[]{ Business.class },
                                                                     dproxy );

        dBusinessProxy.investMoney( "Petrol" );
        dBusinessProxy.saveMoney();
    }
}
