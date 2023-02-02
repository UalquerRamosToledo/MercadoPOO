package Fonte;

public class ProdutoUnidade extends Produto{
    private int quantidade;

    public ProdutoUnidade(String nome, String descricao, double preco, int quantidade) {
        super(nome, descricao, preco);
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

    /**
     * @param quantidade valor a ser subtraido do estoque do produto
     * @throws Exception
     */
    @Override
    public void subtrairQuantidade(double quantidade) throws Exception {
        if(quantidade > 0)
            this.quantidade -= (int) quantidade;
        throw new IllegalArgumentException("Não foi possível alterar! O número informado é inválido!");
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = (int) quantidade;
    }

    /**
     * @param preco será o novo preço a ser setado no Produto.
     * @throws Exception
     */
    @Override
    public void setPreco(double preco) throws Exception {
        super.setPreco(preco);
    }

    /**
     * @param quantidade é o valor a ser adicionado ao estoque do produto
     * @throws Exception
     */
    @Override
    public void adicionarQuantidade(double quantidade) throws Exception {
        if(quantidade > 0)
            this.quantidade += (int) quantidade;
        throw new IllegalArgumentException("Não foi possível alterar! O número informado é inválido!");
    }

   // @Override
   public String toString() {
       return "Cód " + getCodigo() + "  |  Nome " + getNome() + "  |  Descrição " + getDescricao() + "  |  Preço " + getPreco() + "  |  Quantidade " + quantidade + " Un \n";
   }
}
