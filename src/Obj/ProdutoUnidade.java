package Obj;

public class ProdutoUnidade extends Produto{
    private int quantidade;

    public ProdutoUnidade(int codigo, String nome, String descricao, double preco, int quantidade) {
        super(codigo, nome, descricao, preco);
        this.quantidade = quantidade;
    }
}
