package behavior.visitor.liquorshop;

public interface LiquorTaxesVisitor
{
    double visit( Rakia rakia );

    double visit( Vodka vodka );

    double visit( Whisky whisky );

    double visit( Wine wine );

    double visit( Beer beerF );
}
