package Estrutura_Dados;

public class Programa60 
{
    public static void main( String[] args ) 
    {
        Pilha pilha = new Pilha();

        System.out.println( pilha );

        pilha.insere( "Maria" );
        pilha.insere( "jose" );

        System.out.println( pilha );

        String r1 = pilha.remove();
        System.out.println( r1 );
    }    
}
