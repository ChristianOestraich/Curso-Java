import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Programa82 
{
    public static void main( String[] args ) 
    {
        LocalDate hoje = LocalDate.now();
        System.out.println( hoje );

        LocalDate anoNovo = LocalDate.of( 2022, Month.JANUARY, 1 );
        System.out.println( anoNovo );

        int ano = anoNovo.getYear();
        Month mes = anoNovo.getMonth();
        int dia = anoNovo.getDayOfYear();

        System.out.println( "O ano novo será em " + dia + "de" + mes + "de" + ano );

        Period period = Period.between( hoje, anoNovo );
        
        System.out.println( period );

        System.out.println( " Faltam " + period.getYears() + " anos " + period.getMonths() + " meses e " + period.getDays() + " dias. " );

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "dd/MM/yyy" );
        System.out.println( hoje.format( formatter ) );

        LocalDateTime dateTime = LocalDateTime.now();
        System.err.println( dateTime );

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern( "dd/MM/yyy HH:mm:ss" );
        System.out.println( dateTime.format( dateTimeFormatter ) );
    }    
}
