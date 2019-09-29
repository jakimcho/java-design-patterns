package behavior.visitor.liquorshop;

public class Vodka implements Liquor
{

    private final static Double PRISE = 7.6D;

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