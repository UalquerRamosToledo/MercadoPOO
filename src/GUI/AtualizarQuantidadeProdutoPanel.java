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

    public AtualizarQuantidadeProdutoPanel(RelacaoDeProdutos relacaoDeProdutos) {
        this.relacaoDeProdutos = relacaoDeProdutos;
        JPanel panel = new JPanel(new GridLayout(7, 2));

        codigoProdutoField = new JTextField();
        buscarProdutoBtn = new JButton("Buscar Produto");
        atualizarQuantidadeBtn = new JButton("Atualizar Quantidade");

        buscarProdutoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo = Integer.parseInt(codigoProdutoField.getText());
                try {
                    relacaoDeProdutos.getProduto(codigo).toString();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,"Produto não encontrado.","Erro!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        panel.add(codigoProdutoField);
        panel.add(buscarProdutoBtn);
        panel.add(atualizarQuantidadeBtn);
        panel.setVisible(true);
        add(panel);
    }
}
