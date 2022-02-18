package Classes_Abstratas;

public class TreinamentoInicioTemporada 
    extends Treinamento
{
    @Override
    public void preparoFisico() 
    {
        System.out.println( "Preparo fisico de inicio de temporada" );
    }

    @Override
    public void jogoTreino() 
    {
        System.out.println( "Jogo treino de inicio de temporada" );
    }
}
