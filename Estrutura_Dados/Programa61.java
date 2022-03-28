package Estrutura_Dados;

import java.util.Stack;

public class Programa61 
{
    public static void main( String[] args ) 
    {
        Stack<String> nomes = new Stack<String>();

        System.out.println( nomes );
        nomes.push( "Angelina" ); 
        nomes.push( "Pedro" ); 
        System.out.println( nomes );

        String r1 = nomes.pop();
        System.out.println( r1 );
        System.out.println( nomes );
    }    
}
