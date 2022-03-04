package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Modificadores_Acesso.Cliente;

public class Programa47 
{
    public static void main( String[] args ) 
    {
        List<Cliente> clientes = new ArrayList<Cliente>();

        Cliente clie1 = new Cliente( 18, "Amanda", "Rua 1" );
        Cliente clie2 = new Cliente( 60, "Maria", "Rua 2" );
        Cliente clie3 = new Cliente( 45, "José", "Rua 3" );
        Cliente clie4 = new Cliente( 78, "Chico", "Rua 7" );

        clientes.add( clie1 );
        clientes.add( clie2 );
        clientes.add( clie3 );
        clientes.add( clie4 );

        Collections.sort( clientes );

       for ( Cliente cliente : clientes ) 
       {
            System.out.println( cliente );
       }
    }    
}
