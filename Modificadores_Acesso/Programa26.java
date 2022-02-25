package Modificadores_Acesso;

public class Programa26 
{
    
    /** 
     * @param args
     */
    public static void main( String[] args ) 
    {
        Cliente cliente = new Cliente( "Felicity Jones", "Rua Qualquer, 123" );

        System.out.println( cliente.getNome() );
    }    
}
