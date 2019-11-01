package behavior.visitor.liquorshop.cahin_of_responsibility;

import behavior.visitor.liquorshop.cahin_of_responsibility.chains.Calculator;
import behavior.visitor.liquorshop.cahin_of_responsibility.data.CircleData;
import behavior.visitor.liquorshop.cahin_of_responsibility.data.RectangleData;
import behavior.visitor.liquorshop.cahin_of_responsibility.data.TriangleData;

/**
 * @author yakimfb
 * @since 1.11.19
 **/
public class Main
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();

        RectangleData rectangle = new RectangleData();
        rectangle.setSideA( 2D );
        rectangle.setSideB( 3D );

        CircleData circle = new CircleData();
        circle.setDiameter( 5D );

        TriangleData triangleData = new TriangleData();
        triangleData.setSideA( 7D );
        triangleData.setSideB( 4D );
        triangleData.setSideC( 5D );


        System.out.println( "Calculated rect: " + calculator.calcData( rectangle ) );
        System.out.println( "Calculated circle: " + calculator.calcData( circle ) );
        System.out.println( "Calculated triangle: " + calculator.calcData( triangleData ) );
    }
}
