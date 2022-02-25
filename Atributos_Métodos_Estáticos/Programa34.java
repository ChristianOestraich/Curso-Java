package Atributos_Métodos_Estáticos;

public class Programa34 
{
    public static void main( String[] args ) 
    {
        Conta c1 = new Conta( "João dos Santos" );
        
        System.out.println( c1.getNumero() );
        System.out.println( c1.getCliente() );
        
        Conta c2 = new Conta( "Maria Terezinha" );
        
        System.out.println( c2.getNumero() );
        System.out.println( c2.getCliente() );
        
        System.out.println( Conta.contador );
    }    
}
