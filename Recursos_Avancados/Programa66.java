import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa66 
{
    public static void main( String[] args ) 
    {
        List<String> palavras = new ArrayList<String>();

        Comparator<String> comparator = new ComparadorTamanho();

        palavras.add( "Teste 08" );
        palavras.add( "Teste 02" );
        palavras.add( "Teste 03" );
        palavras.add( "Teste 04" );
        palavras.add( "Teste 05" );
        palavras.add( "Teste 06" );

        // Collections.sort( palavras, comparator );

        palavras.sort( comparator );

        for ( int i = 0; i < palavras.size(); i++ ) 
        {
            System.out.println( "A palavra " + palavras.get( i ) + " tem tamanho " + palavras.get( i ).length() );
        }

        System.out.println( palavras );

    }    
}
 