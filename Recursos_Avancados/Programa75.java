import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa75 
{
    public static void main( String[] args ) 
    {
        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add( new Curso( "Programação para Leigos", 170 ) );
        cursos.add( new Curso( "Algoritimos e Lógica de Programação: Essencial", 280 ) );
        cursos.add( new Curso( "Programação em C: Essencial", 125 ) );
        cursos.add( new Curso( "Programação em Java: Essencial", 0 ) );
        cursos.add( new Curso( "Programação em Python: Essencial", 0 ) );
        cursos.add( new Curso( "Banco de Dados: Essencial", 0 ) );

        // cursos.sort( Comparator.comparing( c -> c.getAlunos() ) );
        cursos.sort( Comparator.comparing( Curso::getAlunos ) );

        // cursos.forEach( c -> System.out.println( c.getNome() ) );
        cursos.forEach( System.out::println );
    }    
}
