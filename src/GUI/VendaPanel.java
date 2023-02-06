package GUI;

import Colecoes.RelacaoDeNotasFiscais;
import Colecoes.RelacaoDeProdutos;
import Fonte.NotaFiscal;
import Fonte.Produto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/**
 * Esta é a classe para a Interface Grafica para Exibir o Ponto de Venda.
 *
 * @author Deivid, Ualquer
 * @version 1.0
 */

public class VendaPanel extends JPanel {
    RelacaoDeProdutos relacaoDeProdutos;
    RelacaoDeNotasFiscais relacaoDeNotasFiscais;
    JButton finalizarVendaBtn, adicionarProdutoBtn;
    JLabel codProdutoLabel, nomeLabel, descricaoLabel, quantidadeLabel, precoLabel;
    JTextField codProdutoField, nomeField, descricaoField, quantidadeField, precoField;
    public VendaPanel(RelacaoDeProdutos relacaoDeProdutos, RelacaoDeNotasFiscais relacaoDeNotasFiscais){
        this.relacaoDeProdutos = relacaoDeProdutos;
        this.relacaoDeNotasFiscais = relacaoDeNotasFiscais;

        JPanel panel = new JPanel(new GridLayout(10,1));
        codProdutoLabel = new JLabel("Digite o código do produto e tecle Enter: ");
        codProdutoField = new JTextField();

        nomeLabel = new JLabel("Nome: ");
        nomeField = new JTextField();
        nomeField.setEditable(false);

        descricaoLabel = new JLabel("Descrição: ");
        descricaoField = new JTextField();
        descricaoField.setEditable(false);

        quantidadeLabel = new JLabel("Digite a quantidade: ");
        quantidadeField = new JTextField();

        precoLabel = new JLabel("Preço:");
        precoField = new JTextField();
        precoField.setEditable(false);

        adicionarProdutoBtn = new JButton(" Adicionar ");
        finalizarVendaBtn = new JButton(" Finalizar ");

        codProdutoField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    int codigo = Integer.parseInt(codProdutoField.getText());
                    try {
                        relacaoDeProdutos.getProduto(codigo);
                        nomeField.setText(relacaoDeProdutos.getProduto(codigo).getNome());
                        descricaoField.setText(relacaoDeProdutos.getProduto(codigo).getDescricao());
                        precoField.setText(String.valueOf(relacaoDeProdutos.getProduto(codigo).getPreco()));
                    }catch (Exception ex){
                        JOptionPane.showMessageDialog(null,"Digite novamente o código do produto. ","Não encontrado", JOptionPane.INFORMATION_MESSAGE);
                    }

                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        adicionarProdutoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int cod = Integer.parseInt(codProdutoField.getText());
                    relacaoDeProdutos.getProduto(cod);



                    NotaFiscal notaFiscal = new NotaFiscal();

                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,"Não foi possível adiconar o produto.","Erro !", JOptionPane.INFORMATION_MESSAGE);
                }


            }
        });

        finalizarVendaBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });

        panel.add(codProdutoLabel);
        panel.add(codProdutoField);
        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(descricaoLabel);
        panel.add(descricaoField);
        panel.add(quantidadeLabel);
        panel.add(quantidadeField);
        panel.add(precoLabel);
        panel.add(precoField);
        panel.add(finalizarVendaBtn);
        panel.add(adicionarProdutoBtn);
        panel.setVisible(true);
        add(panel);
    }
}
