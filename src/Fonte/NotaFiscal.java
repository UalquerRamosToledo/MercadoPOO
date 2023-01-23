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
}
