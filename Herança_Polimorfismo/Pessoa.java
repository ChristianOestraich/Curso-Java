package Herança_Polimorfismo;

public abstract class Pessoa 
{
    private String nome;
    private int ano_nascimento;
    private String email;
    
    public Pessoa(){}

    /**
     * @param nome
     * @param ano_nascimento
     */
    public Pessoa( String nome, int ano_nascimento, String email ) 
    {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.email = email;
    }

    /**
     * @return the email
     */
    public String getEmail() 
    {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail( String email ) 
    {
        this.email = email;
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
     * @return the ano_nascimento
     */
    public int getAno_nascimento() 
    {
        return ano_nascimento;
    }

    /**
     * @param ano_nascimento the ano_nascimento to set
     */
    public void setAno_nascimento( int ano_nascimento ) 
    {
        this.ano_nascimento = ano_nascimento;
    }

    @Override
    public String toString() 
    {
        return "Nome: " + this.nome + "\nAno Nascimento: " + this.ano_nascimento;
    }

    public void mensagem() 
    {
        System.out.println( "Primeira mensagem" );    
    }

    public void mensagem( String msn ) 
    {
        System.out.println(msn);     
    }

    public abstract void outraMensagem( String texto );
}
 