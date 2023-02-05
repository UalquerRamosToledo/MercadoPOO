package GUI;

import Colecoes.RelacaoDeProdutos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AtualizarQuantidadeProdutoPanel extends JPanel{
    RelacaoDeProdutos relacaoDeProdutos;
    JButton buscarProdutoBtn, atualizarQuantidadeBtn;
    JTextField codigoProdutoField, quantidadeField;
    JLabel buscarProdutoLabel, descricaoProdutoLabel, atualizarQuantidadeLabel;

    public AtualizarQuantidadeProdutoPanel(RelacaoDeProdutos relacaoDeProdutos) {
        this.relacaoDeProdutos = relacaoDeProdutos;
        JPanel panel = new JPanel(new GridLayout(7, 1));

        buscarProdutoLabel = new JLabel("Digite o código do produto: ");
        codigoProdutoField = new JTextField();
        buscarProdutoBtn = new JButton("Buscar");
        descricaoProdutoLabel = new JLabel("");
        atualizarQuantidadeLabel = new JLabel("Dite a nova quantidade: ");
        quantidadeField = new JTextField();
        atualizarQuantidadeBtn = new JButton("Atualizar");

        buscarProdutoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo = Integer.parseInt(codigoProdutoField.getText());
                try {
                    String produtoCompleto = relacaoDeProdutos.getProduto(codigo).toString();
                    descricaoProdutoLabel.setText(produtoCompleto);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,"Produto não encontrado.","Erro!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        atualizarQuantidadeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo = Integer.parseInt(codigoProdutoField.getText());
                int quantidade = Integer.parseInt(quantidadeField.getText());
                try {
                    relacaoDeProdutos.updateQuantidade(codigo, (int) quantidade);
                    JOptionPane.showMessageDialog(null,relacaoDeProdutos.getProduto(codigo),"Quantidade atualizada! ", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,"Quantidade não atualizada.","Erro!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        panel.add(buscarProdutoLabel);
        panel.add(codigoProdutoField);
        panel.add(buscarProdutoBtn);
        panel.add(descricaoProdutoLabel);
        panel.add(atualizarQuantidadeLabel);
        panel.add(quantidadeField);
        panel.add(atualizarQuantidadeBtn);
        panel.setVisible(true);
        add(panel);
    }
}
