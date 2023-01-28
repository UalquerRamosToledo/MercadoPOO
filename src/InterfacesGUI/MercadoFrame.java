package InterfacesGUI;

import Colecoes.RelacaoDeNotasFiscais;
import Colecoes.RelacaoDeProdutos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

public class MercadoFrame extends JFrame {
    RelacaoDeProdutos relacaoDeProdutos;
    RelacaoDeNotasFiscais relacaoDeNotasFiscais;
    JMenuBar menuBar;
    JMenu vendaMenu, estoqueMenu, nfMenu;
    JMenuItem pdvOption, adicionarProdutoOption, adicionarNFOption;
    JPanel vendaPanel;
    public MercadoFrame(RelacaoDeProdutos relacaoDeProdutos, RelacaoDeNotasFiscais relacaoDeNotasFiscais){
        this.relacaoDeProdutos = relacaoDeProdutos;
        this.relacaoDeNotasFiscais = relacaoDeNotasFiscais;

        // Cria um menu bar
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Cria os menus "Venda, Estoque, Nota Fiscal"
        vendaMenu = new JMenu("Venda");
        estoqueMenu = new JMenu("Estoque");
        nfMenu = new JMenu("Nota Fiscal");
        menuBar.add(vendaMenu);
        menuBar.add(estoqueMenu);
        menuBar.add(nfMenu);

        // Cria as opções "PDV, exibir Todos" no menu "Venda"
        pdvOption = new JMenuItem("PDV");
        vendaMenu.add(pdvOption);

        //Cria as opões de "Adicionar Produto" no menu "Estoque"
        adicionarProdutoOption = new JMenuItem("Adicionar Produto");
        estoqueMenu.add(adicionarProdutoOption);

        //Cria as Opções de "Adicionar" no menu "Nota Fiscal"
        adicionarNFOption = new JMenuItem("Adicionar Nota Fiscal");
        nfMenu.add(adicionarNFOption);

        vendaPanel = new JPanel();
        adicionarListner();

        add(vendaPanel, BorderLayout.CENTER);
        setTitle("Mercado POO");
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public void adicionarListner(){
        pdvOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendaPanel.removeAll();
                vendaPanel.setBackground(Color.red);
                JLabel a = new JLabel("Deu certo");
                vendaPanel.add(a);
                vendaPanel.setVisible(true);
            }
        });
        adicionarNFOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendaPanel.removeAll();
                vendaPanel.setBackground(Color.BLUE);
                vendaPanel.setVisible(true);
            }
        });
    }
}
