package Modificadores_Acesso;

public class Programa25 
{
    
    /** 
     * @param args
     */
    public static void main( String[] args ) 
    {
        Cliente joao = new Cliente( 16, "Jão da Silva", "Rua da Paz, 45" );
        Cliente maria = new Cliente( 56, "Maria da Silva", "Rua da Paz, 45" );

        Conta conta1 = new Conta( 1, 100.0f, 200.0f, maria );
        Conta conta2 = new Conta( 2, 200.0f, 800.0f, joao );

        System.out.println( "Saldo do João: " + conta1.getSaldo() );
        System.out.println( "Saldo do João: " + conta2.getSaldo() );
    }    
}
