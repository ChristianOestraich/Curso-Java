import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa71 
{
    public static void main( String[] args ) 
    {
        List<String> palavras = new ArrayList<String>();
        
        Comparator<String> comparador = new ComparadorTamanho();

        palavras.add( "Geek" );
        palavras.add( "University" );
        palavras.add( "Java" );
        palavras.add( "Maria" );
        palavras.add( "Playstation 5" );
        palavras.add( "Oulast 2" );

        palavras.sort( comparador );

        palavras.forEach( (String s) ->
        {
            System.out.println( s );
        } );
    }    
}
