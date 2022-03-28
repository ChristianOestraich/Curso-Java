package Estrutura_Dados;

import java.util.LinkedList;
import java.util.List;

public class Fila 
{
    private List<String> nomes = new LinkedList<String>();

    public void adiciona( String nome )
    {
        this.nomes.add( nome );
    }

    public String remove()
    {
        return nomes.remove( 0 );
    }

    public boolean vazia()
    {
        int tam = this.nomes.size();

        if ( tam == 0 ) 
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    @Override
    public String toString() 
    {
       return this.nomes.toString();
    }

}
