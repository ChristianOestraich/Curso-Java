package Funções;

import java.util.Scanner;

public class Programa21 
{
    static Scanner teclado = new Scanner( System.in );
    static String fruta[];

    public static void main( String[] args ) 
    {
        int qtd;
         
        System.out.println( "Informe a quantidade de frutas que você deseja cadastrar" );
        qtd = teclado.nextInt();
        
        cadastrar_dados( qtd );

        mostrar_dados( qtd );
        
        teclado.close();
    }

    static void cadastrar_dados( int quantidade )
    {
        fruta = new String[ quantidade ];
        
        for ( int i = 0; i < quantidade; i++ ) 
        {
            System.out.println( "Informe a " + ( i + 1 ) + "fruta" );
            fruta[i] = teclado.nextLine();
        }
    }

    static void mostrar_dados( int quantidade )
    {
        for ( int i = ( quantidade - 1 ); i >= 0; i-- ) 
        {
            System.out.println( fruta[i] );
        }
    }
}
