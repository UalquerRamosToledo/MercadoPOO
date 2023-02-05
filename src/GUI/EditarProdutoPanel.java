package GUI;

import Colecoes.RelacaoDeProdutos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

public class EditarProdutoPanel extends JPanel {
    JLabel idLabel;
    JTextField idField;
    JButton editarBTN;
    JPanel panel;
    RelacaoDeProdutos relacaoDeProdutos;
    public EditarProdutoPanel(RelacaoDeProdutos relacaoDeProdutos){
        this.relacaoDeProdutos = relacaoDeProdutos;

        panel = new JPanel(new GridLayout(7,2));
        idLabel = new JLabel("Digite o Código do Produto");
        idField = new JTextField();
        editarBTN = new JButton("Editar");

        editarBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo = Integer.parseInt(idField.getText());
            }
        });

        panel.add(idLabel);
        panel.add(idField);
        panel.add(editarBTN);
        add(panel);
    }
}
