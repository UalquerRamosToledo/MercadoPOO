package Fonte;

public class ProdutoQuilo extends Produto {
    private double quantidade;

    public ProdutoQuilo(int codigo, String nome, String descricao, double preco, double quantidade) {
        super(codigo, nome, descricao, preco);
        this.quantidade = quantidade;
    }
}
