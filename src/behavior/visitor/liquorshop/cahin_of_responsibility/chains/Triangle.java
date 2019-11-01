package behavior.visitor.liquorshop.cahin_of_responsibility.chains;

import behavior.visitor.liquorshop.cahin_of_responsibility.data.Data;
import behavior.visitor.liquorshop.cahin_of_responsibility.data.TriangleData;

/**
 * @author yakimfb
 * @since 1.11.19
 **/
public class Triangle
        extends Chain
{
    @Override
    public Double doIt( final Data data )
    {
        if ( data instanceof TriangleData )
        {
            TriangleData triangle = (TriangleData) data;
            return triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
        } else
        {
            return nextChain.doIt( data );
        }
    }


}
