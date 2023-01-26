package Colecoes;

import Interfaces.IProdutos;
import Fonte.Produto;

import java.security.spec.ECField;
import java.util.ArrayList;

public class RelacaoDeProdutos implements IProdutos {
    /**
     * Array do tipo Produto
     * @autor Ualquer
     */
    private ArrayList<Produto> relacaoDeProdutos;

    public RelacaoDeProdutos() {
        this.relacaoDeProdutos = new ArrayList<Produto>();
    }

    /**
     * Adiciona um produto ao estoque.
     *
     * @param p Produto
     * @throws Exception Lança exceção quando o produto não pode ser adicionado.
     */
    @Override
    public void addProduto(Produto p) throws Exception {
        try {
            relacaoDeProdutos.add(p);
        }catch (Exception e){
            System.out.println("Não foi possível adicionar o produto");
        }
    }

    /**
     * Remove o produto com código informado.
     *
     * @param codigo Código do produto a ser removido.
     * @return
     * @throws Exception Lança exceção quando o produto não pode ser removido, por exemplo,
     *                   porque não existe produto cadastrado com o código informado.
     */
    @Override
    public void removeProduto(int codigo) throws Exception{
        try{
            for (Produto produto : relacaoDeProdutos) {
                if (produto.getCodigo() == codigo) {
                    relacaoDeProdutos.remove(produto);
                }
            }
        }catch (Exception e) {
            System.out.println("Produto não removido");
        }
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
        for (Produto produto : relacaoDeProdutos){
            if(codigo == produto.getCodigo()){
                return produto;
            }
        }
        throw new IllegalArgumentException("Não encontrado!");
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
        try {
            for (Produto produto : relacaoDeProdutos) {
                if (codigo == produto.getCodigo()) {
                    produto.adicionarQuantidade(nova);
                }
            }
        } catch (Exception e){
            System.out.println("Não foi possível aterar a quantidade.");
        }
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
        try {
            for (Produto produto : relacaoDeProdutos) {
                if (codigo == produto.getCodigo()) {
                    produto.setPreco(novo);
                }
            }
        }catch (Exception e) {
            System.out.println("Não foi possível aterar o preço.");
        }
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
        try {
            for (Produto produto : relacaoDeProdutos) {
                if (codigo == produto.getCodigo()) {
                    produto.adicionarQuantidade(quantidade);
                }
            }
        } catch (Exception e){
            System.out.println("Não foi possível aterar a quantidade.");
        }
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

    @Override
    public String toString() {
        return "RelacaoDeProdutos{" +
                "relacaoDeProdutos=" + relacaoDeProdutos +
                '}';
    }
}
