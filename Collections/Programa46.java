package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Programa46 
{
    public static void main( String[] args ) 
    {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add( 4 );
        numeros.add( 5 );
        numeros.add( 67 );
        numeros.add( 12 );
        numeros.add( 865 );

        Collections.sort( numeros );

        for ( int i = 0; i < numeros.size(); i++ ) 
        {
            System.out.println( numeros );
        }
    }    
}
