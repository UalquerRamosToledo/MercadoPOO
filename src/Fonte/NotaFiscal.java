package Fonte;
// código, data e relação de itens, onde cada item é composto
//por um produto e a quantidade vendida.

import java.time.LocalDateTime;
import java.util.ArrayList;

public class NotaFiscal {
    private int codigo;
    private LocalDateTime data;
    private ArrayList<Produto> relacaoDeItens;

    public NotaFiscal(int codigo, ArrayList<Produto> relacaoDeItens) {
        this.codigo = codigo;
        this.relacaoDeItens = relacaoDeItens;
    }

    public int getCodigo() {
        return codigo;
    }

    /**
     *
     * @return valorTotal é a soma do valor de todos os produtos
     */
    public double valorTotalNF(){
        double valorTotal = 0;
        for(Produto produto : relacaoDeItens){
            valorTotal += produto.getPreco();
        }
        return valorTotal;
    }

    /**
     *
     * @param produto produto a ser adicionado ao array
     */
    public void adicionarProduto(Produto produto){
        relacaoDeItens.add(produto);
    }

    /**
     *
     * @param produto produto a ser removido da nota fiscal
     * @throws Exception lança se o produto não estiver na nota fiscal
     */
    public void removerProdutoNF(Produto produto) throws Exception{
        for (Produto p: relacaoDeItens){
            if (p.getCodigo() == produto.getCodigo()){
                relacaoDeItens.remove(p);
            }
        }
        throw new IllegalArgumentException("Código não encontrado!");
    }
}
