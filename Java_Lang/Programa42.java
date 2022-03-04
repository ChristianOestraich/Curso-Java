package Java_Lang;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Programa42 
{
    public static void main( String[] args ) 
    {
        Scanner tecladoScanner = new Scanner( System.in );
        
        try 
        {
            PrintStream printStream = new PrintStream( "saida.txt" );
            
            for ( int i = 0; i < 5; i++ ) 
            {
                System.out.println( "Escreva algo: " );
                String msn = tecladoScanner.nextLine();
                printStream.println( msn );
                printStream.close();
            }
        } 

        catch ( FileNotFoundException e ) 
        {
            e.printStackTrace();
        }

        tecladoScanner.close();
    }    
}
