package Java_Lang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa43 
{
    public static void main( String[] args ) 
    {
        try 
        {
            Scanner scanner = new Scanner( new FileInputStream( "entrada.txt" ) );

            while ( scanner.hasNextLine() ) 
            {
                String linha = scanner.nextLine();
                System.out.println( linha );
            }

            scanner.close();
        } 
        
        catch ( FileNotFoundException e ) 
        {
            e.printStackTrace();
        }


    }    
}
