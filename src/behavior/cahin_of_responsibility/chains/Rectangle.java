package behavior.cahin_of_responsibility.chains;

import behavior.cahin_of_responsibility.data.Data;
import behavior.cahin_of_responsibility.data.RectangleData;

/**
 * @author yakimfb
 * @since 1.11.19
 **/
public class Rectangle
        extends Chain
{
    @Override
    public Double doIt( final Data data )
    {
        if ( data instanceof RectangleData )
        {
            RectangleData rectangle = (RectangleData) data;
            return 2 * rectangle.getSideA() + 2 * rectangle.getSideB();
        } else
        {
            return nextChain.doIt( data );
        }
    }

}
