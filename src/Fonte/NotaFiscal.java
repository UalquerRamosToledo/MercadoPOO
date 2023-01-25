package Fonte;
// código, data e relação de itens, onde cada item é composto
//por um produto e a quantidade vendida.

import java.time.LocalDateTime;
import java.util.ArrayList;

public class NotaFiscal {
    private int codigo;
    private LocalDateTime data;
    private ArrayList<Item> relacaoDeItens;

    public NotaFiscal(int codigo, ArrayList<Item> relacaoDeItens) {
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
        for(Item item : relacaoDeItens){
            valorTotal += item.getValorTotal();
        }
        return valorTotal;
    }

    /**
     *
     * @param item produto a ser adicionado ao array
     */
    public void adicionarProduto(Item item){
        relacaoDeItens.add(item);
    }

    /**
     *
     * @param item item a ser removido da nota fiscal
     * @throws Exception lança se o produto não estiver na nota fiscal
     */
    public void removerItemNF(Item item) throws Exception{
        for (Item i: relacaoDeItens){
            if (i.getCodigo() == i.getCodigo()){
                relacaoDeItens.remove(item);
            }
        }
        throw new IllegalArgumentException("Código não encontrado!");
    }
}
