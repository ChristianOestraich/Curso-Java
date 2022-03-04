package Java_Lang;

public class Programa41 
{
    public static void main( String[] args ) 
    {
        String curso = "Programação em Java: Essencial";

        curso = curso.replace( "Java", "Python" );
        curso = curso.toLowerCase();
        
        System.out.println( curso );
        
        curso = curso.toUpperCase();
        
        System.out.println( curso );
    }    
}
