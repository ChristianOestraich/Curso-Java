package Herança_Polimorfismo;

public class Professor extends Pessoa
{
    private String matricula;
    
    /** */
    public Professor( String nome, int ano_nascimento, String email, String matricula ) 
    {
        super( nome, ano_nascimento, email );
        this.matricula = matricula;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() 
    {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula( String matricula ) 
    {
        this.matricula = matricula;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() 
    {
        return super.toString() + "\nMatricula: " + this.matricula;
    }

    @Override
    public void outraMensagem( String texto ) {}
}
