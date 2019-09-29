package behavior.visitor.liquorshop;

public class Rakia
        implements Liquor
{

    private final static Double PRISE = 7D;

    @Override
    public double addTaxes( LiquorTaxesVisitor liquorTaxesVisitor )
    {
        return PRISE * liquorTaxesVisitor.visit( this );
    }

    @Override
    public double getPrise()
    {
        return PRISE;
    }
}
