package behavior.visitor.liquorshop;

public class LiquorBGTaxesVisitor
        implements LiquorTaxesVisitor
{
    @Override
    public double visit( Rakia rakia )
    {
        return 1.2;
    }

    @Override
    public double visit( Vodka vodka )
    {
        return 1.1;
    }

    @Override
    public double visit( Whisky whisky )
    {
        return 1.25;
    }

    @Override
    public double visit( Wine wine )
    {
        return 1.21;
    }

    @Override
    public double visit( Beer beerF )
    {
        return 1.1;
    }
}
