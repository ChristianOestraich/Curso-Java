package Java_Lang;

public class Caixa 
{
    private Object[] objects;
    private int posicaoLivre;

    public Caixa ()
    {
        objects = new Object[100];
        posicaoLivre = 0;
    }

    public void adicionar( Object nova )
    {
        this.objects[this.posicaoLivre] = nova;
    }

    public Object pegar( int posicao )
    {
        return this.objects[posicao];
    }
}
