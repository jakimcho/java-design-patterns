package structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicBusinessProxy implements InvocationHandler
{

    private Object target;

    public DynamicBusinessProxy(Object target){
        this.target = target;
    }

    @Override
    public Object invoke( Object proxy,
                          Method method,
                          Object[] args ) throws Throwable
    {
        System.out.println("You should check your wallet first");
        Object res = method.invoke( target, args );
        return res;
    }
}
