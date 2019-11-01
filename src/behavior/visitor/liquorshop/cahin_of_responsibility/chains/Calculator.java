package behavior.visitor.liquorshop.cahin_of_responsibility.chains;

import behavior.visitor.liquorshop.cahin_of_responsibility.data.Data;

/**
 * @author yakimfb
 * @since 1.11.19
 **/
public class Calculator
{
    private Chain chain;

    public Calculator()
    {
        Triangle triangle = new Triangle();
        triangle.addChain( new Circle() ).addChain( new Rectangle() );
        this.chain = triangle;
    }

    public Double calcData( Data data )
    {
        return this.chain.doIt( data );
    }
}
