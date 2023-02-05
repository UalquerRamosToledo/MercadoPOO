package GUI;

import Colecoes.RelacaoDeNotasFiscais;
import Colecoes.RelacaoDeProdutos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MercadoFrame extends JFrame {
    GridBagConstraints constraints;
    RelacaoDeProdutos relacaoDeProdutos;
    RelacaoDeNotasFiscais relacaoDeNotasFiscais;
    JMenuBar menuBar;
    JMenu vendaMenu, estoqueMenu, nfMenu;
    JMenuItem pdvOption, adicionarProdutoOption, adicionarNFOption, exibirNFOption, exibirProdutosOption, removerProdutoOption;

    /*Classes*/
    AdicionarProdutoPanel adicionarProdutoPanel;
    ExibirNotasFiscaisPanel exibirNotasFiscaisPanel;

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

        removerProdutoOption = new JMenuItem("Remover Produto");
        estoqueMenu.add(removerProdutoOption);

        exibirProdutosOption = new JMenuItem("Exibir Todos Produtos");
        estoqueMenu.add(exibirProdutosOption);


        //Cria as Opções de "Adicionar" no menu "Nota Fiscal"
        adicionarNFOption = new JMenuItem("Adicionar Nota Fiscal");
        nfMenu.add(adicionarNFOption);

        exibirNFOption = new JMenuItem("Exibir todas");
        nfMenu.add(adicionarNFOption);

        pdvOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               VendaPanel vendaPanel = new VendaPanel(relacaoDeProdutos, relacaoDeNotasFiscais);
               setContentPane(vendaPanel);
               revalidate();
               repaint();

            }
        });
        adicionarProdutoOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarProdutoPanel  = new AdicionarProdutoPanel(relacaoDeProdutos);
                setContentPane(adicionarProdutoPanel);
                revalidate();
                repaint();
            }
        });
        removerProdutoOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RemoverProdutoPanel removerProdutoPanel = new RemoverProdutoPanel(relacaoDeProdutos);
                setContentPane(removerProdutoPanel);
                revalidate();
                repaint();
            }
        });
        exibirProdutosOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ExibirProdutosPanel exibirProdutosPanel = new ExibirProdutosPanel(relacaoDeProdutos);
                revalidate();
                repaint();
            }
        });
        exibirNFOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ExibirNotasFiscaisPanel exibirNotasFiscaisPanel = new ExibirNotasFiscaisPanel(relacaoDeNotasFiscais, relacaoDeProdutos);
                setContentPane(exibirNotasFiscaisPanel);
                revalidate();
                repaint();
                System.out.println("click");
            }
        });

        setTitle("Mercado POO");
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setLayout(new GridBagLayout());
        setVisible(true);
    }
}
