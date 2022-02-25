package Interfaces;

public class Ventilador implements IEletronico
{
    private boolean ligado = false;

    @Override
    public void ligar() 
    {
        if ( ! this.ligado )
        {
            this.ligado = true;

            System.out.println( "Ventilador Ligado" );
        }
    }

    @Override
    public void desligar() 
    {
        if ( this.ligado ) 
        {
            this.ligado = false;

            System.out.println( "Ventilador Desligado" );
        }
    }
    
}
