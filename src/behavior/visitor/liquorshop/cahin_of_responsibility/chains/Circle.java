package behavior.visitor.liquorshop.cahin_of_responsibility.chains;

import behavior.visitor.liquorshop.cahin_of_responsibility.data.CircleData;
import behavior.visitor.liquorshop.cahin_of_responsibility.data.Data;
import behavior.visitor.liquorshop.cahin_of_responsibility.data.TriangleData;

/**
 * @author yakimfb
 * @since 1.11.19
 **/
public class Circle
        extends Chain
{
    @Override
    public Double doIt( final Data data )
    {
        if ( data instanceof CircleData )
        {
            return ( (CircleData) data ).getDiameter() * Math.PI;
        } else
        {
            return this.nextChain.doIt( data );
        }
    }

}
