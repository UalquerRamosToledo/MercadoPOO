package InterfacesGUI;

import Colecoes.RelacaoDeNotasFiscais;
import Colecoes.RelacaoDeProdutos;

import javax.swing.*;

public class MercadoFrame extends JFrame {
    RelacaoDeProdutos relacaoDeProdutos;
    RelacaoDeNotasFiscais relacaoDeNotasFiscais;
    public MercadoFrame(RelacaoDeProdutos relacaoDeProdutos, RelacaoDeNotasFiscais relacaoDeNotasFiscais){

        this.relacaoDeProdutos = relacaoDeProdutos;
        this.relacaoDeNotasFiscais = relacaoDeNotasFiscais;

        // Cria um menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Cria os menus "Venda, Estoque, Nota Fiscal"
        JMenu vendaMenu = new JMenu("Venda");
        JMenu estoqueMenu = new JMenu("Estoque");
        JMenu nfMenu = new JMenu("Nota Fiscal");
        menuBar.add(vendaMenu);
        menuBar.add(estoqueMenu);
        menuBar.add(nfMenu);


        // Cria as opções "PDV, exibir Todos" no menu "Venda"
        JMenuItem pdvOption = new JMenuItem("PDV");

        vendaMenu.add(pdvOption);

        //Cria as opões de "Adicionar Produto" no menu "Estoque"
        JMenuItem adicionarProdutoOption = new JMenuItem("Adicionar Produto");

        estoqueMenu.add(adicionarProdutoOption);

        //Cria as Opções de "Adicionar" no menu "Nota Fiscal"

        JMenuItem adicionarNFOption = new JMenuItem("Adicionar Nota Fiscal");
        nfMenu.add(adicionarNFOption);

        setTitle("Mercado POO");
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
