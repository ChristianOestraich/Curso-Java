package Modificadores_Acesso;

public class Cliente implements Comparable
{
    private int idade;
    private String nome;
    private String endereco;
    /**
     * @param nome
     * @param endereco
     */
    public Cliente( int idade, String nome, String endereco )
    {
        this.idade = idade;
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

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    
    }

    @Override
    public String toString() 
    {
        return this.nome;
    }

    @Override
    public int compareTo( Object outro ) 
    {
        Cliente aux = (Cliente) outro;

       if ( this.idade < aux.idade  )
       {
           return -1;
       }

       else if ( this.idade > aux.idade )
       {
            return 1;
       }

       else 
       {
           return 0;
       }
    }
}
