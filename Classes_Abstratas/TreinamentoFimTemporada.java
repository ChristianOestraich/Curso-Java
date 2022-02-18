package Classes_Abstratas;

public class TreinamentoFimTemporada 
    extends Treinamento
{
    @Override
    public void preparoFisico() 
    {
        System.out.println( "Preparo fisico de final de temporada" );
    }

    @Override
    public void jogoTreino() 
    {
        System.out.println( "Jogo treino de final de temporada" );
    }
}
