package GUI;

import Colecoes.RelacaoDeNotasFiscais;
import Colecoes.RelacaoDeProdutos;
import javax.swing.*;
import java.awt.*;

public class VendaPanel extends JPanel {
    RelacaoDeProdutos relacaoDeProdutos;
    RelacaoDeNotasFiscais relacaoDeNotasFiscais;
    JButton addProdutoBTN, finalizarVenda;
    public VendaPanel(RelacaoDeProdutos relacaoDeProdutos, RelacaoDeNotasFiscais relacaoDeNotasFiscais){
        this.relacaoDeProdutos = relacaoDeProdutos;
        this.relacaoDeNotasFiscais = relacaoDeNotasFiscais;
        JPanel panel = new JPanel(new GridLayout(5, 2));

        JLabel produtoLabel = new JLabel("Código Produto:");
        JTextField produtoField = new JTextField();

        JLabel quantidadeLabel = new JLabel("Quantidade:");
        JTextField quantidadeField = new JTextField();

        JLabel precoLabel = new JLabel("Preço:");
        JTextField precoField = new JTextField();


        addProdutoBTN = new JButton("Adicionar Produto");
        finalizarVenda = new JButton("Finalizar Venda");

        panel.add(produtoLabel);
        panel.add(produtoField);
        panel.add(quantidadeLabel);
        panel.add(quantidadeField);
        panel.add(precoLabel);
        panel.add(precoField);
        panel.add(addProdutoBTN);
        panel.add(finalizarVenda);
        panel.setVisible(true);
        add(panel);
    }
}
