package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Programa45 
{
    public static void main( String[] args ) 
    {
        ArrayList<String> nome = new ArrayList<String>();

        nome.add( "Ana" );
        nome.add( "Maria" );
        nome.add( "João" );

        for ( int i = 0; i < nome.size(); i++ ) 
        {
            System.out.println( nome.get( i ) );
        }

        Collections.sort( nome );

        for ( String nomes : nome ) 
        {
            System.out.println( nome );
        }
    }    
}
