package behavior.visitor.liquorshop;

public interface Liquor
{
    double addTaxes( LiquorTaxesVisitor liquorTaxesVisitor );

    double getPrise();
}
