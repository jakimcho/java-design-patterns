package behavior.visitor.liquorshop.cahin_of_responsibility.data;

/**
 * @author yakimfb
 * @since 1.11.19
 **/
public class TriangleData implements Data
{
    private Double sideA;
    private Double sideB;
    private Double sideC;

    public Double getSideA()
    {
        return sideA;
    }

    public void setSideA( Double sideA )
    {
        this.sideA = sideA;
    }

    public Double getSideB()
    {
        return sideB;
    }

    public void setSideB( Double sideB )
    {
        this.sideB = sideB;
    }

    public Double getSideC()
    {
        return sideC;
    }

    public void setSideC( Double sideC )
    {
        this.sideC = sideC;
    }
}
