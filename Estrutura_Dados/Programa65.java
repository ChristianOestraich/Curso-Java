package Estrutura_Dados;

import java.util.HashSet;
import java.util.Set;

public class Programa65 
{
    public static void main( String[] args ) 
    {
        Set<String> nomes = new HashSet<String>();
        
        System.out.println( nomes );

        nomes.add( "Ana" );
        nomes.add( "Agelica" );
        nomes.add( "Gabriela" );
        
        System.out.println( nomes );
        
        String nome1 = "Ana";
        String nome2 = "Agelica";
        String nome3 = "Gabriela";
        
        System.out.println( nome1.hashCode() );
        System.out.println( nome2.hashCode() );
        System.out.println( nome3.hashCode() );
    }    
}
