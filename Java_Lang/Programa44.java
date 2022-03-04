package Java_Lang;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Programa44 
{
    public static void main( String[] args ) 
    {
        Scanner scanner = new Scanner( System.in );
        try 
        {
            PrintStream scPrintStream = new PrintStream( new FileOutputStream( "saida.txt", true ) );

            while ( scanner.hasNextLine() ) 
            {
                String linha = scanner.nextLine();
                System.out.println( linha );
            }

            scPrintStream.close();
        } 
        
        catch ( FileNotFoundException e ) 
        {
            e.printStackTrace();
        }

        scanner.close();
    }    
}
