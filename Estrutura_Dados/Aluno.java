package Estrutura_Dados;

public class Aluno 
{
    private String nome;

    /**
     * @param nome
     */
    public Aluno( String nome ) 
    {
        this.nome = nome;
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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() 
    {
        return this.nome;
    }


    @Override
    public boolean equals( Object obj ) 
    {
        Aluno outro = (Aluno) obj;

        return outro.getNome().equals( this.nome );
    }

}
