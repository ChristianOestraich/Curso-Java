import java.util.ArrayList;
import java.util.List;

public class Programa72 
{
    public static void main( String[] args ) 
    {
        List<String> palavras = new ArrayList<String>();
        
        palavras.add( "Geek" );
        palavras.add( "University" );
        palavras.add( "Java" );
        palavras.add( "Maria" );
        palavras.add( "Playstation 5" );
        palavras.add( "Oulast 2" );

        // palavras.sort( ( o1, o2 ) ->
        // {
        //     if ( o1.length() < o2.length() )
        //     {
        //         return -1;
        //     }
    
        //     if ( o1.length() > o2.length() )
        //     {
        //         return 1;       
        //     }
            
        //     return 0;
        // } );

        palavras.sort( ( s1, s2 ) -> Integer.compare( s1.length(), s2.length() ) );

        palavras.forEach( s -> System.out.println( s ) );
    }
}
