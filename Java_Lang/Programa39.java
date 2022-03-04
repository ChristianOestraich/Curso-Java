package Java_Lang;

import Modificadores_Acesso.*;

public class Programa39 
{
    public static void main( String[] args ) 
    {
        Cliente cliente1 = new Cliente( 67, "João dos Santos", "Rua da paz 45" );
        Cliente cliente2 = new Cliente( 20, "Maria dos Santos", "Rua da paz 46" );

        Conta conta1 = new Conta( 1, 200, 300, cliente1 );
        Conta conta2 = new Conta( 1, 200, 300, cliente2 );

        Caixa prateleira = new Caixa();

        System.out.println( conta1.toString() );
        System.out.println( conta2.toString() );

        if ( cliente1.equals( cliente2 ) )
        {
            System.out.println( "São a mesma conta." );
        }

        else
        {
            System.err.println( "São contas diferentes." );
        }

        prateleira.adicionar( conta1 );
        prateleira.adicionar( conta2 );

        System.out.println( ( (Conta) prateleira.pegar( 0 ) ).getSaldo() );
    }
}
