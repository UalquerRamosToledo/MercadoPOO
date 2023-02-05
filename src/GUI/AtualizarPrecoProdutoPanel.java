package GUI;

import Colecoes.RelacaoDeProdutos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AtualizarPrecoProdutoPanel extends JPanel {
    private RelacaoDeProdutos relacaoDeProdutos;
    private JLabel idLabel, precoLabel;
    private JTextField idField, precoField;
    JButton atualizarBTN;

    public AtualizarPrecoProdutoPanel(RelacaoDeProdutos relacaoDeProdutos) {

        this.relacaoDeProdutos = relacaoDeProdutos;
        JPanel panel = new JPanel(new GridLayout(7, 2));

        idLabel = new JLabel("Digita o Código do Produto:");
        idField = new JTextField();

        precoLabel = new JLabel("Novo Preço:");
        precoField = new JTextField();

        atualizarBTN = new JButton("Atualizar Preço");

        atualizarBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo = Integer.parseInt(idField.getText());
                double novo = Double.parseDouble(precoField.getText());
                try {
                    relacaoDeProdutos.updatePreco(codigo, novo);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        panel.add(idLabel);
        panel.add(idField);
        panel.add(atualizarBTN);
        panel.setVisible(true);

        add(panel);
    }
}
