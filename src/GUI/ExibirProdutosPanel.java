package GUI;

import Colecoes.RelacaoDeProdutos;

import javax.swing.*;
import java.awt.*;


public class ExibirProdutosPanel extends JPanel{
    RelacaoDeProdutos relacaoDeProdutos;

    public ExibirProdutosPanel(RelacaoDeProdutos relacaoDeProdutos){
        this.relacaoDeProdutos = relacaoDeProdutos;
        JTextArea textArea = new JTextArea(relacaoDeProdutos.toString());
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(700, 500));
        JOptionPane.showMessageDialog(null, scrollPane, "Lista de Produtos", JOptionPane.INFORMATION_MESSAGE);


    }
}
