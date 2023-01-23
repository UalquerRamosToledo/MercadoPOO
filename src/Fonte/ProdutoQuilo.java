package Fonte;

public class ProdutoQuilo extends Produto {
    private double quantidade;

    public ProdutoQuilo(int codigo, String nome, String descricao, double preco, double quantidade) {
        super(codigo, nome, descricao, preco);
        this.quantidade = quantidade;
    }

    /**
     * @param quantidade recebe um double, e a classe do produto decide o tipo de dado que vai
     *                   setar a quantidade (double, ou int)
     * @throws Exception
     */
    @Override
    public void receberQuantidade(double quantidade) throws Exception {
        this.setQuantidade(quantidade);
    }

    /**
     * @param preco será o novo preço a ser setado no Produto.
     * @throws Exception
     */
    @Override
    public void setPreco(double preco) throws Exception {
        super.setPreco(preco);
    }

    public double getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}
