package behavior.visitor.liquorshop;

public class Whisky
        implements Liquor
{

    private final static Double PRISE = 21.5D;

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
