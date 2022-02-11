package Funções;

public class Programa22 
{
    public static void main( String[] args ) 
    {
        int valor1 = 6;
        int valor2 = 4;
        int res;

        res = soma( valor1, valor2 );

        System.out.println( "O resultado é " + res );
    }
    
    static int soma( int v1, int v2 )
    {
        return v1 + v2;
    }
}
