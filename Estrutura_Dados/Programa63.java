package Estrutura_Dados;

import java.util.LinkedList;
import java.util.Queue;

public class Programa63 
{
    public static void main( String[] args ) 
    {
        Queue<String> fila = new LinkedList<String>();

        fila.add( "Angelica" );
        fila.add( "Maria" );
        fila.add( "João" );

        String ret = fila.poll();
        System.out.println( ret );

        System.out.println( fila );
    }    
}
