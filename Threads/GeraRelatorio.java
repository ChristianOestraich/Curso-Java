package Threads;

public class GeraRelatorio implements Runnable
{
    public void executa()
    {
        for ( int i = 0; i < 1000; i++ ) 
        {
            System.out.println( i + "Barra de progresso do relatório....aguarde" );    
        }
    }

    @Override
    public void run() 
    {
        for ( int i = 0; i < 1000; i++ ) 
        {
            System.out.println( "Barra de progresso do relatório....aguarde" );    
        }
        
    }    
}
