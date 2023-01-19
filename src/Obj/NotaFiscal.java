package Obj;
// código, data e relação de itens, onde cada item é composto
//por um produto e a quantidade vendida.

import java.util.ArrayList;

public class NotaFiscal {
    private int codigo;
    private ArrayList<Produto> relacaoDeItens;

    public NotaFiscal(int codigo, ArrayList<Produto> relacaoDeItens) {
        this.codigo = codigo;
        this.relacaoDeItens = relacaoDeItens;
    }
}
