package Estrutura_Dados;

import java.util.LinkedList;
import java.util.List;

public class Pilha 
{
    private List<String> nomes = new LinkedList<String>();

    /**
     * 
     * @param nome
     */
    public void insere( String nome )
    {
        this.nomes.add( nome );
    }

    public String pegaTopo()
    {
        return nomes.get( nomes.size() - 1 );
    }

    /**
     * 
     * @return
     */
    public String remove()
    { 
        return nomes.remove( nomes.size() - 1 ); 
    }

    /**
     * 
     * @return
     */
    public boolean vazia(){ return false; }

    @Override
    public String toString() 
    {    
        return this.nomes.toString();
    }
}
