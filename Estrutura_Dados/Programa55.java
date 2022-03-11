package Estrutura_Dados;

public class Programa55 
{
    public static void main( String[] args ) 
    {
        Aluno a1 = new Aluno( "Maria" );
        Aluno a2 = new Aluno( "João" );

        Vetor lista = new Vetor();

        System.out.println( "Total de alunos: " + lista.tamanho() );

        lista.adiciona(a1);
        System.out.println( "Total de alunos: " + lista.tamanho() );

        lista.adiciona(a2);
        System.out.println( "Total de alunos: " + lista.tamanho() );

        System.out.println( lista );
    }    
}
