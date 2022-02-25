package Orientação_Objetos;

public class Produto 
{
    String nome;
    float preco;
    float desconto;
    
    

    /**
     * 
     */
    public Produto() {}

    /**
     * @param nome
     * @param preco
     * @param desconto
     */
    public Produto( String nome, float preco, float desconto ) 
    {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome( String nome ) 
    {
        this.nome = nome;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco( float preco ) 
    {
        this.preco = preco;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto( float desconto ) 
    {
        this.desconto = desconto;
    }

    /**
     * @return the nome
     */
    public String getNome() 
    {
        return nome;
    }

    /**
     * @return the preco
     */
    public float getPreco() 
    {
        return preco;
    }

    /**
     * @return the desconto
     */
    public float getDesconto() 
    {
        return desconto;
    }

    
    /** 
     * @param valor
     */
    void aumentar_preco( float valor )
    {
        this.preco = this.preco + valor;
    }
}
