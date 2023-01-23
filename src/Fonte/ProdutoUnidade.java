package Fonte;

public class ProdutoUnidade extends Produto{
    private int quantidade;

    public ProdutoUnidade(int codigo, String nome, String descricao, double preco, int quantidade) {
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
        this.quantidade = (int) quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @param preco será o novo preço a ser setado no Produto.
     * @throws Exception
     */
    @Override
    public void setPreco(double preco) throws Exception {
        super.setPreco(preco);
    }
}
