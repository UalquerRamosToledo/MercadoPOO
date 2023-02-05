package GUI;

import Colecoes.RelacaoDeProdutos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoverProdutoPanel extends JPanel {
    RelacaoDeProdutos relacaoDeProdutos;
    JButton removerBTN;
    JLabel idLabel;
    JTextField idField;
    public RemoverProdutoPanel(RelacaoDeProdutos relacaoDeProdutos) {
        this.relacaoDeProdutos = relacaoDeProdutos;
        JPanel panel = new JPanel(new GridLayout(7, 2));

        idLabel = new JLabel("Digita o Código do Produto:");
        idField = new JTextField();

        removerBTN = new JButton("Remover");

        removerBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo = Integer.parseInt(idField.getText());
                try {
                    JOptionPane.showMessageDialog(null, relacaoDeProdutos.getProduto(codigo) , "Produto Removido", JOptionPane.INFORMATION_MESSAGE);
                    relacaoDeProdutos.removeProduto(codigo);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        panel.add(idLabel);
        panel.add(idField);
        panel.add(removerBTN);
        panel.setVisible(true);
        add(panel);
    }
}
