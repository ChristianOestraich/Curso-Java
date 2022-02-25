package Tratamento_Erros;

public class Programa36 
{
    
    /** 
     * @param args
     */
    public static void main( String[] args )
    {
        int numeros[] = new int[5];
        
        for ( int i = 0; i < numeros.length; i++ ) 
        {
            numeros[i] = i + 3 * 2;
        }

        for ( int i = 0; i <= numeros.length; i++ ) 
        {
            try 
            {
                System.err.println( numeros[i] );    
            }

            catch ( Exception e ) 
            {
                e.addSuppressed( e );
            }
            
            finally
            {
                System.out.println( "Continua o processo...." );
            }
        }
    }    
}
