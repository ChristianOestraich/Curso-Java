package Threads;

import Modificadores_Acesso.Cliente;
import Modificadores_Acesso.Conta;

public class Programa54 
{
    public static void main( String[] args ) throws InterruptedException 
    {
        Cliente cli1 = new Cliente( 26, "Maria da Silva", "Rua da paz" );
        Conta c1 = new Conta( 1, 200, 300, cli1 );

        FazDeposito acao =  new FazDeposito( c1 );
        Thread t1 = new Thread( acao );
        Thread t2 = new Thread( acao );

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println( c1 );
    }    
}
