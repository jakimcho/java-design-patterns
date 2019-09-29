package behavior.visitor.liquorshop;

public class LiquorROTaxesVisitor
        implements LiquorTaxesVisitor
{
    @Override
    public double visit( Rakia rakia )
    {
        return 1.7;
    }

    @Override
    public double visit( Vodka vodka )
    {
        return  1.5;
    }

    @Override
    public double visit( Whisky whisky )
    {
        return 1.35;
    }

    @Override
    public double visit( Wine wine )
    {
        return 1.6;
    }

    @Override
    public double visit( Beer beer )
    {
        return 1.3;
    }
}
