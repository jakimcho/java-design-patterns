package behavior.cahin_of_responsibility.data;

/**
 * @author yakimfb
 * @since 1.11.19
 **/
public class RectangleData implements Data
{
    private Double sideA;
    private Double sideB;

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
}
