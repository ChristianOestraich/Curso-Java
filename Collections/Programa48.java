package Collections;

import java.util.HashSet;
import java.util.Set;

public class Programa48 
{
    public static void main( String[] args ) 
    {
        Set<String> nomes = new HashSet<String>();

        nomes.add( "Maria" );
        nomes.add( "João" );
        nomes.add( "José" );
        nomes.add( "Mateus" );

        for ( String nome : nomes ) 
        {
            System.out.println( nome );
        }
    }    
}
