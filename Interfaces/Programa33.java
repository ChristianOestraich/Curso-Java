package Interfaces;

public class Programa33 
{
    public static void main( String[] args ) 
    {
        Ventilador ventilador = new Ventilador();

        System.out.println( "Marca Ventilador: " + ventilador.MARCA );

        ventilador.ligar();
    }    
}
