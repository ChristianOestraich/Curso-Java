import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa74 
{
    public static void main( String[] args ) 
    {
        List<String> palavras = new ArrayList<String>();

        palavras.add( "Geek" );
        palavras.add( "University" );
        palavras.add( "Java" );
        palavras.add( "Ana" );
        palavras.add( "Playstation 5" );
        palavras.add( "Oulast 2" );

        // palavras.sort( Comparator.comparing( s -> s.length() ) );
        palavras.sort( Comparator.comparing( String::length ) );

        System.out.println( palavras );
    }    
}
