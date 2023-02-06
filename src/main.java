import Colecoes.*;
import Fonte.*;
import GUI.MercadoFrame;

public class main {
    public static void main(String args[]) throws Exception {
        ProdutoQuilo p1 = new ProdutoQuilo("Banana", "Banana verde",50,50);
        ProdutoUnidade p2 = new ProdutoUnidade("Arroz 2Kg", "Arroz lavado", 9,20);
        RelacaoDeProdutos relacaoDeProdutos = new RelacaoDeProdutos();
        RelacaoDeNotasFiscais relacaoDeNotasFiscais = new RelacaoDeNotasFiscais();
        relacaoDeProdutos.addProduto(p1);
        relacaoDeProdutos.addProduto(p2);
        MercadoFrame mercadoFrame = new MercadoFrame(relacaoDeProdutos, relacaoDeNotasFiscais);
    }
}
