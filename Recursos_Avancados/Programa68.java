import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Programa68 
{
    public static void main( String[] args ) 
    {
        List<String> palavras = new ArrayList<String>();
        
        Consumer<String> comsumidor = new ImprimeLinha();

        palavras.add( "Geek" );
        palavras.add( "University" );
        palavras.add( "Java" );
        palavras.add( "Maria" );
        palavras.add( "Playstation 5" );
        palavras.add( "Oulast 2" );

        palavras.forEach( comsumidor );

    }
}
