package Modificadores_Acesso;

public class Conta 
{
    private int numero;
    private float saldo;
    private float limite;
    private Cliente cliente;
    /**
     * @param numero
     * @param saldo
     * @param limite
     * @param cliente
     */
    public Conta ( int numero, float saldo, float limite, Cliente cliente ) 
    {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    public void sacar( float valor )
    {
        if ( valor <= this.saldo )
        {
            this.saldo = this.saldo - valor;
        }
    }

    public void depositar( float valor )
    {
        if ( valor >= this.saldo )
        { 
            this.saldo = this.saldo + valor;
        }
    }

    /**
     * @return the numero
     */
    public int getNumero() 
    {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero( int numero ) 
    {
        this.numero = numero;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() 
    {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo( float saldo ) 
    {
        this.saldo = saldo;
    }

    /**
     * @return the limite
     */
    public float getLimite() 
    {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite( float limite ) 
    {
        this.limite = limite;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() 
    {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente( Cliente cliente ) 
    {
        this.cliente = cliente;
    }
    
}
