package Modificadores_Acesso;

public class Cliente 
{
    private String nome;
    private String endereco;
    /**
     * @param nome
     * @param endereco
     */
    public Cliente( String nome, String endereco )
    {
        this.nome = nome;
        this.endereco = endereco;
    }
    /**
     * @return the nome
     */
    public String getNome() 
    {
        return nome;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome( String nome ) 
    {
        this.nome = nome;
    }
    /**
     * @return the endereco
     */
    public String getEndereco() 
    {
        return endereco;
    }
    /**
     * @param endereco the endereco to set
     */
    public void setEndereco( String endereco ) 
    {
        this.endereco = endereco;
    }    
}
