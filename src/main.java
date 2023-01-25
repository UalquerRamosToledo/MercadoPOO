import Colecoes.*;
import Fonte.*;

public class main {
    public static void main(String args[]) throws Exception {
        ProdutoQuilo p1 = new ProdutoQuilo(1,"Banana", "Banana verde",5.00,50.00);
        ProdutoUnidade p2 = new ProdutoUnidade(2, "Arroz 2Kg", "Arroz lavado", 7.00,20);
        RelacaoDeProdutos relacaoDeProdutos = new RelacaoDeProdutos();

        relacaoDeProdutos.addProduto(p1);
        System.out.printf(relacaoDeProdutos.toString());

    }
}
