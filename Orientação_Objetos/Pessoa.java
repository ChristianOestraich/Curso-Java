package Orientação_Objetos;

public class Pessoa 
{
    String nome;
    String email;
    int ano_nascimento;

    

    /**
     * 
     */
    public Pessoa() {}

    /**
     * @param nome
     * @param email
     * @param ano_nascimento
     */
    public Pessoa( String nome, String email, int ano_nascimento ) 
    {
        this.nome = nome;
        this.email = email;
        this.ano_nascimento = ano_nascimento;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome( String nome ) 
    {
        this.nome = nome;
    }

    /**
     * @param email the email to set
     */
    public void setEmail( String email ) 
    {
        this.email = email;
    }

    /**
     * @param ano_nascimento the ano_nascimento to set
     */
    public void setAno_nascimento( int ano_nascimento ) 
    {
        this.ano_nascimento = ano_nascimento;
    }

    /**
     * @return the nome
     */
    public String getNome() 
    {
        return nome;
    }

    /**
     * @return the email
     */
    public String getEmail() 
    {
        return email;
    }

    /**
     * @return the ano_nascimento
     */
    public int getAno_nascimento() 
    {
        return ano_nascimento;
    }

    void imprime_informacoes()
    {
        System.out.println( "Nome: " + this.nome );
        System.out.println( "E-mail: " + this.email );
        System.out.println( "Ano Nascimento: " + this.ano_nascimento );
    }
}
