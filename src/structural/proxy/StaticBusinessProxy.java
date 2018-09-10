package structural.proxy;

import structural.Business;

public class StaticBusinessProxy implements Business
{

    private Business business;

    public StaticBusinessProxy( Business business )
    {
        this.business = business;
    }

    @Override
    public void saveMoney()
    {
        System.out.println("This is called from the static proxy");
        business.saveMoney();
    }

    @Override
    public void investMoney( String stock )
    {
        System.err.println("Sorry you don't have such permissions");
    }
}
