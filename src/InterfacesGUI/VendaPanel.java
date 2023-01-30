package InterfacesGUI;

import Colecoes.RelacaoDeNotasFiscais;
import Colecoes.RelacaoDeProdutos;

import javax.swing.*;
import java.awt.*;

public class VendaPanel extends JPanel {
    RelacaoDeProdutos relacaoDeProdutos;
    RelacaoDeNotasFiscais relacaoDeNotasFiscais;
    GridBagConstraints constraints;
    public VendaPanel(RelacaoDeProdutos relacaoDeProdutos, RelacaoDeNotasFiscais relacaoDeNotasFiscais){
        this.relacaoDeProdutos = relacaoDeProdutos;
        this.relacaoDeNotasFiscais = relacaoDeNotasFiscais;
        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel produtoLabel = new JLabel("Código Produto:");
        JTextField produtoField = new JTextField();

        JLabel quantidadeLabel = new JLabel("Quantidade:");
        JTextField quantidadeField = new JTextField();

        JLabel precoLabel = new JLabel("Preço:");
        JTextField precoField = new JTextField();

        panel.add(produtoLabel);
        panel.add(produtoField);
        panel.add(quantidadeLabel);
        panel.add(quantidadeField);
        panel.add(precoLabel);
        panel.add(precoField);
        panel.setVisible(true);
        add(panel);
    }
}
