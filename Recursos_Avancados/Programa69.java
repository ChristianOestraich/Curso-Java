import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Programa69 
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

        Consumer<String> comsumidor = new Consumer<String>() 
        {
            @Override
            public void accept( String t ) 
            {
                System.out.println( t );
            }
            
        };
        palavras.forEach( comsumidor );

    }    
}
