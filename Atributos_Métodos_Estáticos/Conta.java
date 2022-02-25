package Atributos_Métodos_Estáticos;

public class Conta 
{
    private int numero;
    private String cliente;

    public static int contador = 1;

    /**
     * @param numero
     * @param cliente
     */
    public Conta( String cliente ) 
    {
        this.numero = contador;
        this.cliente = cliente;
        Conta.contador = Conta.contador +1;
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
     * @return the cliente
     */
    public String getCliente() 
    {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente( String cliente ) 
    {
        this.cliente = cliente;
    }

    public static int proximaConta()
    {
        return Conta.contador;
    }
}
