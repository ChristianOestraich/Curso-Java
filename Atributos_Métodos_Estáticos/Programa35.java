package Atributos_Métodos_Estáticos;

public class Programa35 
{
    public static void main( String[] args ) 
    {
        Conta c1 = new Conta( "Meu cliente" );

        System.out.println( "Número da Conta: " + c1.getNumero() );
        System.out.println( "Cliente: " + c1.getCliente() );

        System.out.println( "A próxima conta será: " + Conta.proximaConta() );
    }
}
