package behavior.visitor.liquorshop.cahin_of_responsibility.chains;

import behavior.visitor.liquorshop.cahin_of_responsibility.data.Data;

/**
 * @author yakimfb
 * @since 1.11.19
 **/
public abstract class Chain
{
    protected Chain nextChain;

    public abstract Double doIt( Data data );

    public Chain addChain( final Chain nextChain )
    {
        this.nextChain = nextChain;
        return nextChain;
    }
}
