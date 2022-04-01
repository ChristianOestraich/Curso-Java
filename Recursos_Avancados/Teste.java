public interface Teste 
{
    int valor = 9;
    
    public String mensagem();

    default void meu_metodo()
    {
        System.err.println( "Meu default method......." );
    };
}
