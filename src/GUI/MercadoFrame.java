package GUI;

import Colecoes.RelacaoDeNotasFiscais;
import Colecoes.RelacaoDeProdutos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Esta é a classe para a Interface Grafica para genenciar todas as funcionalidades da aplicação.
 *
 * @author Deivid, Ualquer
 * @version 1.0
 */
public class MercadoFrame extends JFrame {
    GridBagConstraints constraints;
    RelacaoDeProdutos relacaoDeProdutos;
    RelacaoDeNotasFiscais relacaoDeNotasFiscais;
    JMenuBar menuBar;
    JMenu vendaMenu, estoqueMenu, nfMenu;
    JMenuItem pdvOption, adicionarProdutoOption, atualizarPrecoProdutoOpition, atualizarQuantidadeProdutoOption, notaFiscalOption, exibirProdutosOption, removerProdutoOption;

    /*Classes*/
    AdicionarProdutoPanel adicionarProdutoPanel;
    AtualizarPrecoProdutoPanel atualizarPrecoPanel;
    AtualizarQuantidadeProdutoPanel atualizarQuantidadeProdutoPanel;

    public MercadoFrame(RelacaoDeProdutos relacaoDeProdutos, RelacaoDeNotasFiscais relacaoDeNotasFiscais){
        this.relacaoDeProdutos = relacaoDeProdutos;
        this.relacaoDeNotasFiscais = relacaoDeNotasFiscais;

        // Cria um menu bar
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Cria os menus "Venda, Estoque, Nota Fiscal"
        vendaMenu = new JMenu("Venda");
        estoqueMenu = new JMenu("Estoque");
        menuBar.add(vendaMenu);
        menuBar.add(estoqueMenu);

        // Cria as opções "PDV, exibir Todos" no menu "Venda"
        pdvOption = new JMenuItem("PDV");
        vendaMenu.add(pdvOption);

        notaFiscalOption = new JMenuItem("Nota Fiscal");
        vendaMenu.add(notaFiscalOption);

        //Cria as opões de "Adicionar Produto" no menu "Estoque"
        adicionarProdutoOption = new JMenuItem("Adicionar Produto");
        estoqueMenu.add(adicionarProdutoOption);
        atualizarPrecoProdutoOpition = new JMenuItem("Atualizar Preço");
        estoqueMenu.add(atualizarPrecoProdutoOpition);
        atualizarQuantidadeProdutoOption = new JMenuItem("Atualizar Quantidade");
        estoqueMenu.add(atualizarQuantidadeProdutoOption);
        removerProdutoOption = new JMenuItem("Remover Produto");
        estoqueMenu.add(removerProdutoOption);
        exibirProdutosOption = new JMenuItem("Exibir Todos Produtos");
        estoqueMenu.add(exibirProdutosOption);

        pdvOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               VendaPanel vendaPanel = new VendaPanel(relacaoDeProdutos, relacaoDeNotasFiscais);
               setContentPane(vendaPanel);
               revalidate();
               repaint();

            }
        });
        notaFiscalOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NotaFiscalPanel notaFiscalPanel = new NotaFiscalPanel(relacaoDeProdutos, relacaoDeNotasFiscais);
                setContentPane(notaFiscalPanel);
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
        atualizarPrecoProdutoOpition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarPrecoPanel = new AtualizarPrecoProdutoPanel(relacaoDeProdutos);
                setContentPane(atualizarPrecoPanel);
                revalidate();
                repaint();
            }
        });

        atualizarQuantidadeProdutoOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarQuantidadeProdutoPanel = new AtualizarQuantidadeProdutoPanel(relacaoDeProdutos);
                setContentPane(atualizarQuantidadeProdutoPanel);
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

        setTitle("Mercado POO");
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
