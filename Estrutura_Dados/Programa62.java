package Estrutura_Dados;

public class Programa62 
{
    public static void main( String[] args ) 
    {
        Fila fila = new Fila();
        
        System.out.println( fila );

        fila.adiciona( "Maria" );
        fila.adiciona( "Pedro" );
        fila.adiciona( "Julia" );

        System.out.println( fila );

        String ret = fila.remove();
        System.out.println( ret );

        System.out.println( fila );
    }    
}
