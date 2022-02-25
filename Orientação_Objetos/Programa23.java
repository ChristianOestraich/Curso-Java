package Orientação_Objetos;

public class Programa23 
{
    
    /** 
     * @param args
     */
    public static void main( String[] args ) 
    {        
        Produto produto = new Produto();

        produto.nome = "Notebook";
        produto.preco = 2.5614f;
        produto.desconto = 15.0f;

        System.out.println( "========= Produtos =========" );
        System.out.println( produto.nome );
        System.out.println( "R$" + produto.preco );
        System.out.println( produto.desconto + "%" );
    }
}
