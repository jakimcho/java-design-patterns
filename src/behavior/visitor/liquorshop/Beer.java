package behavior.visitor.liquorshop;

public class Beer
        implements Liquor
{

    private static final Double PRISE = 2D;

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