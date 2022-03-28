package Estrutura_Dados;

public class Programa64 
{
    public static void main ( String[] args ) 
    {
        Conjunto conjunto = new Conjunto();

        System.out.println( conjunto );

        conjunto.adiciona( "Julia" );
        conjunto.adiciona( "Maria" );
        conjunto.adiciona( "Ana" );
        conjunto.adiciona( "Aninha" );

        System.out.println( conjunto );
    } 
}
