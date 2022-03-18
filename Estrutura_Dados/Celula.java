package Estrutura_Dados;

public class Celula 
{
    private Object elemento;
    private Celula proximo;
    private Celula anterior;
    
    /**
     * @param elemento
     * @param proximo
     */
    public Celula( Object elemento, Celula proximo ) 
    {
        this.elemento = elemento;
        this.proximo = proximo;
    }
    
    public Celula( Object elemento ) 
    {
        this( elemento, null );
    }

    /**
     * @return the anterior
     */
    public Celula getAnterior() 
    {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior( Celula anterior ) 
    {
        this.anterior = anterior;
    }

    /**
     * @return the proximo
     */
    public Celula getProximo() 
    {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo( Celula proximo ) 
    {
        this.proximo = proximo;
    }

    /**
     * @return the elemento
     */
    public Object getElemento() 
    {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento( Object elemento ) 
    {
        this.elemento = elemento;
    }
}
