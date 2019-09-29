package behavior.visitor.liquorshop;

public class Main
{
    public static void main( String[] args )
    {
        LiquorStore store1 = new LiquorStore( new LiquorBGTaxesVisitor() );

        System.out.println("\nIn the BG store");
        System.out.println( "Buy rakia: " + store1.sellLiquor( "Rakia" ) );
        System.out.println( "Buy wine: " + store1.sellLiquor( "Wine" ) );
        System.out.println( "Buy whisky: " + store1.sellLiquor( "Whisky" ) );
        System.out.println( "Buy vodka: " + store1.sellLiquor( "Vodka" ) );
        System.out.println( "Buy beer: " + store1.sellLiquor( "Beer" ) );


        LiquorStore store2 = new LiquorStore( new LiquorROTaxesVisitor() );

        System.out.println("\nIn the RO store");
        System.out.println( "Buy rakia: " + store2.sellLiquor( "Rakia" ) );
        System.out.println( "Buy wine: " + store2.sellLiquor( "Wine" ) );
        System.out.println( "Buy whisky: " + store2.sellLiquor( "Whisky" ) );
        System.out.println( "Buy vodka: " + store2.sellLiquor( "Vodka" ) );
        System.out.println( "Buy beer: " + store2.sellLiquor( "Beer" ) );
    }
}
