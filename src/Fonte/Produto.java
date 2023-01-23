package Fonte;

public abstract class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;

    public Produto(int codigo, String nome, String descricao, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    /**
     * Vai retornar o código do produto
     * @autor Ualquer
     * @return
     */
    public int getCodigo(){
        return codigo;
    }

    /**
     *
     * @param quantidade recebe um double, e a classe do produto decide o tipo de dado que vai
     *                   setar a quantidade (double, ou int)
     * @throws Exception
     */
    public abstract void receberQuantidade(double quantidade) throws Exception;

    /**
     *
     * @param preco será o novo preço a ser setado no Produto.
     * @throws Exception
     */
    public void setPreco(double preco) throws  Exception{
        this.preco = preco;
    };
}
