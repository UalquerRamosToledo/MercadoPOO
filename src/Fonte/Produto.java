package Fonte;

public abstract class Produto {
    private static int contadorGeral = 0;
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;

    public Produto( String nome, String descricao, double preco) {
        this.codigo = contadorGeral ++;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
    public Produto(){

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
      * @param quantidade é o valor a ser adicionado ao estoque do produto
     * @throws Exception
     */
    public abstract void adicionarQuantidade(double quantidade) throws Exception;

    /**
     *
     * @param quantidade valor a ser subtraido do estoque do produto
     * @throws Exception
     */
    public abstract void subtrairQuantidade(double quantidade) throws Exception;

    /**
     *
     * @param preco será o novo preço a ser setado no Produto.
     * @throws Exception
     */
    public void setPreco(double preco) throws  Exception{
        this.preco = preco;
    };

    public double getPreco() {
        return preco;
    }
    public String getNome(){
        return this.nome;
    }
    public String getDescricao(){return this.descricao; }
    public abstract void setQuantidade(double nova) throws Exception;
}
