package Executáveis_Documentação;

import java.util.Scanner;

import Modificadores_Acesso.Cliente;
import Modificadores_Acesso.Conta;

public class Principal 
{
    static Cliente cliente = new Cliente( "Mateus Moura", "Rua da paz, 45" );
    static Conta conta = new Conta( 1, 200, 300, cliente );
    static Scanner teclado = new Scanner( System.in );

    public static void depositar()
    {
        System.out.println( "==================== Depositar ====================" );
        System.out.println( "Informe o valor para o deposito: " );

        float valor = teclado.nextInt();

        if ( valor > 0 )
        {
            conta.depositar( valor );
            System.out.println( "Depósito efetuado com suscesso." );
        }

        else
        {
            System.out.println( "O valor precisa ser positivo." );
        }
    }

    public static void sacar()
    {
        System.out.println( "==================== Sacar ====================" );
        System.out.println( "Informe o valor para o saque: " );
        
        float valor = teclado.nextFloat();

        if ( valor > 0 ) 
        {
            conta.sacar( valor );
            System.out.println( "Saque efetuado com sucesso." );
        }

        else
        {
            System.out.println( "O valor precisar ser maior que zero." );
        }
    }

    public static void consultar()
    {
        System.out.println( "Seu saldo é " + conta.getSaldo() );
    }

    public static void main( String[] args ) 
    {
        int opcao = 0;

        System.out.println( "Bem Vindo ao Banco Geek" );

        do 
        {
            System.out.println( "Selecione uma opção abaixo" );
            System.out.println( "1 - Depositar" );
            System.out.println( "2 - Sacar" );
            System.out.println( "3 - Consultar Saldo" );
            System.out.println( "0 - Sair" );
            opcao = teclado.nextInt();

            switch ( opcao ) 
            {
                case 1:
                    depositar();
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    depositar();
                    break;
                case 0:
                    depositar();
                    break;
            
                default:
                    System.out.println( "Opção Invalida" );
                    break;
            }
            
        } while ( opcao > 0 );

        teclado.close();
    }
}
