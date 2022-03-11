package Threads;

public class Programa52 
{
    public static void main( String[] args ) 
    {
        BarraProgresso barra = new BarraProgresso();
        Thread t1 = new Thread( barra );
        t1.start();

        GeraRelatorio relatorio = new GeraRelatorio();
        Thread t2 = new Thread( relatorio );
        t2.start();
    }    
}