package behavior.visitor.liquorshop;

import java.util.HashMap;
import java.util.Map;
import java.util.OptionalDouble;

public class LiquorStore
{
    private LiquorTaxesVisitor liquorTaxesVisitor;

    private Map<String, Liquor> liquorSet = new HashMap<>();

    public LiquorStore( LiquorTaxesVisitor liquorTaxesVisitor )
    {
        this();
        this.liquorTaxesVisitor = liquorTaxesVisitor;
    }

    private LiquorStore()
    {
        liquorSet.put( "Rakia",
                       new Rakia() );
        liquorSet.put( "Vodka",
                       new Vodka() );
        liquorSet.put( "Whisky",
                       new Whisky() );
        liquorSet.put( "Wine",
                       new Wine() );
        liquorSet.put( "Beer",
                       new Beer() );
    }


    public double sellLiquor( String name )
    {
        return OptionalDouble.of( liquorSet.get( name )
                                           .addTaxes( this.liquorTaxesVisitor ) )
                             .orElse( 0 );
    }

}
