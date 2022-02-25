package Orientação_Objetos;

public class Programa24 
{
    
    /** 
     * @param args
     */
    public static void main( String[] args ) 
    {
        Pessoa pessoa = new Pessoa();
        
        pessoa.nome = "Felicity Jones";
        pessoa.email = "felicity@gmail.com"; 
        pessoa.ano_nascimento = 1986;

        System.out.println( "Nome: " + pessoa.nome );
        System.out.println( "E-mail: " + pessoa.email );
        System.out.println( "Ano Nascimento: " + pessoa.ano_nascimento );
    }    
}
