public class Programa07 
{
    public static void main(String[] args) 
    {
        int numero = 5;

        switch ( numero ) 
        {
            case 1:
                System.out.println( "O numero e 1" );
                break;

            case 3:
                System.out.println( "O numero e 3");
            break;

            case 5:
                System.out.println( "O numero e 5");
            break;
        
            default:
                System.out.println( "Não sei que numero e esse!!!!" );
                break;
        }
    }    
}
