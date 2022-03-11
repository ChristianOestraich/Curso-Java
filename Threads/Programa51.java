package Threads;

public class Programa51 
{ 
    public static void main( String[] args ) 
    {
        BarraProgresso barraProgresso = new BarraProgresso();
        GeraRelatorio geraRelatorio = new GeraRelatorio();

        barraProgresso.executa();
        geraRelatorio.executa();
    }    
}
