public class Curso 
{
    private String nome;
    private int alunos;

    public Curso( String nome, int alunos )
    {
        this.nome = nome;
        this.alunos = alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos( int alunos ) 
    {
        this.alunos = alunos;
    }

    /**
     * @return the alunos
     */
    public int getAlunos() 
    {
        return alunos;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome( String nome ) 
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

    @Override
    public String toString() 
    {
        return this.nome;
    }
}
