package GUI;

import Colecoes.RelacaoDeProdutos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Esta é a classe para a Interface Grafica para Atualizar o Preço de um Produto.
 *
 * @author Deivid, Ualquer
 * @version 1.0
 */

public class AtualizarPrecoProdutoPanel extends JPanel {
    private RelacaoDeProdutos relacaoDeProdutos;
    private JLabel buscarProdutoLabel, descricaoProdutoLabel, atualizarQuantidadeLabel;
    private JTextField codigoProdutoField, precoField;
    JButton buscarProdutoBtn, atualizarPrecoBTN;

    public AtualizarPrecoProdutoPanel(RelacaoDeProdutos relacaoDeProdutos) {

        this.relacaoDeProdutos = relacaoDeProdutos;
        JPanel panel = new JPanel(new GridLayout(7, 1));

        buscarProdutoLabel = new JLabel("Digite o código do produto: ");
        codigoProdutoField = new JTextField();
        buscarProdutoBtn = new JButton("Buscar");
        descricaoProdutoLabel = new JLabel("");
        atualizarQuantidadeLabel = new JLabel("Digite o novo Preço: ");
        precoField = new JTextField();
        atualizarPrecoBTN = new JButton("Atualizar");

        buscarProdutoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int codigo = Integer.parseInt(codigoProdutoField.getText());
                    String produtoCompleto = relacaoDeProdutos.getProduto(codigo).toString();
                    descricaoProdutoLabel.setText(produtoCompleto);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,"Produto não encontrado.","Erro!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        atualizarPrecoBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int codigo = Integer.parseInt(codigoProdutoField.getText());
                    double preco = Double.parseDouble(precoField.getText());
                    relacaoDeProdutos.updatePreco(codigo, preco);
                    JOptionPane.showMessageDialog(null,relacaoDeProdutos.getProduto(codigo),"Quantidade atualizada! ", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,"Preço não atualizado.","Erro!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        panel.add(buscarProdutoLabel);
        panel.add(codigoProdutoField);
        panel.add(buscarProdutoBtn);
        panel.add(descricaoProdutoLabel);
        panel.add(atualizarQuantidadeLabel);
        panel.add(precoField);
        panel.add(atualizarPrecoBTN);
        panel.setVisible(true);
        add(panel);
    }
}
