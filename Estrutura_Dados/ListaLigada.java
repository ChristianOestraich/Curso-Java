package Estrutura_Dados;

public class ListaLigada 
{
    private Celula primeira = null;
    private Celula ultima = null;
    private int total = 0;

    /**
     * 
     * @param elemento
     */
    public void adicionaComeco( Object elemento )
    {
        if ( this.total == 0 )
        {
            Celula nova = new Celula( elemento );
            this.primeira = nova;
            this.ultima = nova;
        }

        else
        {
            Celula nova = new Celula( elemento, this.primeira );
            this.primeira.setAnterior( nova );
            this.primeira = nova;
        }
     
    }

    /**
     * 
     * @param elemento
     */
    public void adiciona( Object elemento )
    {
        if ( this.total == 0 ) 
        {
            this.adicionaComeco( elemento );
        }

        else
        {
            Celula nova = new Celula( elemento, null );
            this.ultima.setProximo( nova );
            nova.setAnterior( this.ultima );
            this.ultima = nova;
            this.total = this.total + 1;
        }
    }

    /**
     * 
     * @param posicao
     * @param elemento
     */
    public void adiciona( int posicao, Object elemento )
    {
        if ( posicao == 0 )
        {
            this.adicionaComeco( elemento );
        }

        else if ( posicao == this.total )
        {
            this.adiciona( elemento );
        }

        else
        {
            Celula anterior = this.pegaCelula( posicao - 1);
            Celula proxima = anterior.getProximo();
            Celula nova = new Celula( elemento, anterior.getProximo() );
            anterior.setProximo( nova );
            nova.setAnterior(anterior);
            proxima.setAnterior( nova );
            this.total = this.total + 1;
        }
    }

    /**
     * 
     * @param posicao
     * @return
     */
    public Object pega( int posicao )
    { 
        return this.pegaCelula( posicao ).getElemento(); 
    }

    /**
     * 
     * @param posicao
     */
    public void remove( int posicao )
    {
        if ( posicao == 0 )
        {
            this.removeComeco();
        }

        else if ( posicao == this.total - 1 )
        {
            this.removeFim();
        }

        else
        {
            Celula anterior = this.pegaCelula( posicao - 1 );
            Celula atual = anterior.getProximo();
            Celula proxima = atual.getProximo();

            anterior.setProximo( proxima );
            proxima.setAnterior( anterior );

            this.total = this.total - 1;
        }
    }
    
    public void removeFim()
    {
        if ( this.total == 1 ) 
        {
            this.removeComeco();
        }

        else
        {
            Celula penultima = this.ultima.getAnterior();
            penultima.setProximo( null );
            this.ultima = penultima;
            this.total = this.total - 1;
        }
    }

    public void removeComeco()
    {
        if ( this.total == 0 ) 
        {
            throw new IllegalArgumentException();
        }

        this.primeira = this.primeira.getProximo();
        this.total = this.total - 1;

        if ( this.total == 0 ) 
        {
            this.ultima = null;
        }
    }

    /**
     * 
     * @return
     */
    public int tamanho()
    { 
        return this.total; 
    }

    /**
     * 
     * @param obj
     * @return
     */
    public boolean contem( Object obj )
    { 
        Celula atual = this.primeira;

        while ( atual != null ) 
        {
            if ( atual.getElemento().equals( obj ) ) 
            {
                return true;
            }

            atual = atual.getProximo();
        }
        
        return false; 
    }

    @Override
    public String toString() 
    {    
        if ( total == 0 )
        {
            return "[]";
        }
        
        Celula atual = primeira;
        StringBuilder builder = new StringBuilder( "[" );

        for ( int i = 0; i < total; i++ ) 
        {
            builder.append( atual.getElemento() );
            builder.append( "," );

            atual = atual.getProximo();
        }

        builder.append( "]" );
        
        return builder.toString();
    }

    /**
     * 
     * @param posicao
     * @return
     */
    private boolean posicaoOcupada( int posicao )
    {
        return posicao >= 0 && posicao < this.total;
    }

    /**
     * 
     * @param posicao
     * @return
     */
    private Celula pegaCelula( int posicao )
    {
        if ( ! posicaoOcupada( posicao ) ) 
        {
            throw new IllegalArgumentException();    
        }

        Celula atual = this.primeira;

        for ( int i = 0; i < posicao; i++ ) 
        {
            atual = atual.getProximo();
        }

        return atual;
    }
}
