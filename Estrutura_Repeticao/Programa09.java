import java.util.Scanner;

public class Programa09 
{
    public static void main(String[] args) 
    {
        int idade = 1;
        String nome;

        Scanner teclado = new Scanner(System.in);

        do
        {
            System.out.println( "Informe seu nome: " );
            nome = teclado.nextLine();
    
            System.out.println( "Informe sua idade: " );
            idade =  Integer.parseInt( teclado.nextLine() );
            
            if ( idade > 0 ) 
            {    
                System.out.println( nome + " tem " + idade + " anos " );
            }
        
        } while ( idade > 0 );

        teclado.close();    
    }    
}
