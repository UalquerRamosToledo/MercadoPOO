package GUI;

import Colecoes.RelacaoDeNotasFiscais;
import Colecoes.RelacaoDeProdutos;

import javax.swing.*;
import java.awt.*;

public class AdicionarProdutoPanel extends JPanel {
    private RelacaoDeProdutos relacaoDeProdutos;
    private RelacaoDeNotasFiscais relacaoDeNotasFiscais;
    public AdicionarProdutoPanel(RelacaoDeProdutos relacaoDeProdutos, RelacaoDeNotasFiscais relacaoDeNotasFiscais) {
        this.relacaoDeProdutos = relacaoDeProdutos;
        this.relacaoDeNotasFiscais = relacaoDeNotasFiscais;
        JPanel panel = new JPanel(new GridLayout(3, 2));
        //int codigo, String nome, String descricao, double preco, double quantidade

        JLabel produtoLabel = new JLabel("Nome do Produto:");
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
