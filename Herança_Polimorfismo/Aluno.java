package Herança_Polimorfismo;

public class Aluno 
        extends Pessoa
{
    private String ra;
    
    /**
     * @param nome
     * @param ano_nascimento
     * @param ra
     */
    public Aluno( String nome, int ano_nascimento, String ra, String email ) 
    {
        super( nome, ano_nascimento, email );
        this.ra = ra;
    }

    /**
     * @return the ra
     */
    public String getRa() 
    {
        return ra;
    }

    /**
     * @param ra the ra to set
     */
    public void setRa( String ra ) 
    {
        this.ra = ra;
    }
  
    @Override
    public String toString() 
    {
        return super.toString() + "\nR.A: " + this.ra;
    }

    @Override
    public void outraMensagem( String texto ) {}
}
