package behavior.visitor.liquorshop;

public class Wine
        implements Liquor
{

    private final static Double PRISE = 12D;

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
