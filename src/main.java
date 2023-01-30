import Colecoes.*;
import Fonte.*;
import GUI.MercadoFrame;

public class main {
    public static void main(String args[]) throws Exception {
        ProdutoQuilo p1 = new ProdutoQuilo("Banana", "Banana verde",5.00,50.00);
        ProdutoUnidade p2 = new ProdutoUnidade("Arroz 2Kg", "Arroz lavado", 7.00,20);
        RelacaoDeProdutos relacaoDeProdutos = new RelacaoDeProdutos();
        RelacaoDeNotasFiscais relacaoDeNotasFiscais = new RelacaoDeNotasFiscais();
        relacaoDeProdutos.addProduto(p1);
        relacaoDeProdutos.addProduto(p2);
        //System.out.println(relacaoDeProdutos.getProduto(1).getNome());
        //relacaoDeProdutos.removeProduto(1);

        //System.out.println(p1.getQuantidade());
        relacaoDeProdutos.updateQuantidade(0, 20.00);
        relacaoDeProdutos.getProduto(0).getNome();
        relacaoDeProdutos.getProduto(1).getPreco();
        //System.out.println(p1.getQuantidade());

        NotaFiscal nf = new NotaFiscal(1);
        nf.adicionarProduto(p1);
        nf.adicionarProduto(p2);
        nf.adicionarProduto(p1);
        System.out.println(nf.toString());
        System.out.println("Valor total da NF " + nf.valorTotalNF());
        System.out.println(nf.getData());

        MercadoFrame mercadoFrame = new MercadoFrame(relacaoDeProdutos, relacaoDeNotasFiscais);
    }
}
