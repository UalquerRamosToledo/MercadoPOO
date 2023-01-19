package Colecoes;

import Interfaces.IProdutos;
import Obj.Produto;

public class ProdutosColecao implements IProdutos {
    /**
     * Adiciona um produto ao estoque.
     *
     * @param p Produto
     * @throws Exception Lança exceção quando o produto não pode ser adicionado.
     */
    @Override
    public void addProduto(Produto p) throws Exception {

    }

    /**
     * Remove o produto com código informado.
     *
     * @param codigo Código do produto a ser removido.
     * @throws Exception Lança exceção quando o produto não pode ser removido, por exemplo,
     *                   porque não existe produto cadastrado com o código informado.
     */
    @Override
    public void removeProduto(int codigo) throws Exception {

    }

    /**
     * Captura o produto com o código informado.
     *
     * @param codigo Código do produto a ser capturado.
     * @return Produto Produto capturado.
     * @throws Exception Lança exceção quando não existe produto
     *                   com o código informado.
     */
    @Override
    public Produto getProduto(int codigo) throws Exception {
        return null;
    }

    /**
     * Altera a quantidade do produto com o código informado.
     *
     * @param codigo Código do produto a ser alterado.
     * @param nova   Nova quantidade do produto.
     * @throws Exception Lança exceção quando não existe produto com o
     *                   código informado ou quando a nova quantidade é inválida.
     */
    @Override
    public void updateQuantidade(int codigo, double nova) throws Exception {

    }

    /**
     * Altera o preço do produto com o código informado.
     *
     * @param codigo Código do produto a ser alterado.
     * @param novo   Novo preço do produto.
     * @throws Exception Lança exceção quando não existe produto com o
     *                   código informado ou quando o novo preço é inválido.
     */
    @Override
    public void updatePreco(int codigo, double novo) throws Exception {

    }

    /**
     * Adiciona a quantidade ao produto com código informado.
     *
     * @param codigo     Código do produto a ser alterado.
     * @param quantidade Quantidade a ser acrescentada.
     * @throws Exception Lança exceção quando não existe produto com o
     *                   código informado ou quando a quantidade é inválida.
     */
    @Override
    public void addQuantidade(int codigo, double quantidade) throws Exception {

    }

    /**
     * Subtrai a quantidade do produto com código informado.
     *
     * @param codigo     Código do produto a ser alterado.
     * @param quantidade Quantidade a ser subtraída.
     * @throws Exception Lança exceção quando não existe produto com o
     *                   código informado ou quando quantidade informada é inválida.
     */
    @Override
    public void subQuantidade(int codigo, double quantidade) throws Exception {

    }
}
