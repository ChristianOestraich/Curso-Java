package Collections;

import java.util.HashMap;
import java.util.Map;

import Modificadores_Acesso.Cliente;
import Modificadores_Acesso.Conta;

public class Programa49 
{
    public static void main( String[] args ) 
    {
        // chave/valor
        Map<String, Conta> contas = new HashMap<String, Conta>();

        Cliente cli1 = new Cliente( 54, "João Silva", "Rua da paz" ); 
        Cliente cli2 = new Cliente( 41, "Maria Souza", "Rua 7 de setembro" );

        Conta c1 = new Conta( 1, 200, 300, cli1 );
        Conta c2 = new Conta( 1, 500, 800, cli2 );

        contas.put( "Pessoa Fisica", c1 );
        contas.put( "Pessoa Jurídica", c2 );

        System.out.println( contas.get( "Pessoa Fisica" ) );
    }
}
