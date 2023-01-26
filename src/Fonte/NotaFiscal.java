package Fonte;
// código, data e relação de itens, onde cada item é composto
//por um produto e a quantidade vendida.

import java.util.ArrayList;
import java.util.Calendar;

public class NotaFiscal {
    private int codigo;
    private Calendar data;
    private ArrayList<Produto> relacaoDeItens;

    public NotaFiscal(int codigo) {
        this.codigo = codigo;
        this.relacaoDeItens = new ArrayList<Produto>();
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
        for(Produto item : relacaoDeItens){
            valorTotal += item.getPreco();
        }
        return valorTotal;
    }

    /**
     *
     * @param item produto a ser adicionado ao array
     */
    public void adicionarProduto(Produto item){
        relacaoDeItens.add(item);
    }

    /**
     *
     * @param item item a ser removido da nota fiscal
     * @throws Exception lança se o produto não estiver na nota fiscal
     */
    public void removerItemNF(Produto item) throws Exception{
        for (Produto i: relacaoDeItens){
            if (i.getCodigo() == i.getCodigo()){
                relacaoDeItens.remove(item);
            }
        }
        throw new IllegalArgumentException("Código não encontrado!");
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "codigo=" + codigo +
                ", data=" + data +
                ", relacaoDeItens=" + relacaoDeItens +
                '}';
    }
}
