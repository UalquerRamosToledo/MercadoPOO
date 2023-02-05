package GUI;

import Colecoes.RelacaoDeNotasFiscais;
import Colecoes.RelacaoDeProdutos;
import Fonte.Produto;
import Fonte.ProdutoQuilo;
import Fonte.ProdutoUnidade;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdicionarProdutoPanel extends JPanel {
    private RelacaoDeProdutos relacaoDeProdutos;
    private JComboBox comboBox;
    private JButton salvarBTN;
    String selecaoCombo;
    Produto produto;
    public AdicionarProdutoPanel(RelacaoDeProdutos relacaoDeProdutos) {
        this.relacaoDeProdutos = relacaoDeProdutos;
        JPanel panel = new JPanel(new GridLayout(7, 2));

        JLabel nomeProdutoLabel = new JLabel("Nome do Produto  ");
        JTextField nomeProdutoField = new JTextField();

        JLabel descricaoLabel = new JLabel("Descrição ");
        JTextField descricaoField = new JTextField();

        JLabel quantidadeLabel = new JLabel("Quantidade ");
        JTextField quantidadeField = new JTextField();

        JLabel precoLabel = new JLabel("Preço ");
        JTextField precoField = new JTextField();

        JLabel tipo = new JLabel("Tipo ");

        String[] options = {"Selecione", "Unidade", "Quilo"};
        comboBox = new JComboBox<>(options);

        salvarBTN = new JButton("Salvar");

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selecaoCombo = (String) comboBox.getSelectedItem();
            }
        });

        salvarBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeProdutoField.getText();
                String descricao = descricaoField.getText();
                double quantidade = Double.parseDouble(quantidadeField.getText());
                double preco = Double.parseDouble(precoField.getText());

                try {
                    if (selecaoCombo.equals("Unidade")){
                        produto = new ProdutoUnidade(nome,descricao,preco,(int) quantidade);
                    }else if(selecaoCombo.equals("Quilo")) {
                        produto = new ProdutoQuilo(nome, descricao, preco, quantidade);
                        JOptionPane.showMessageDialog(null,"Produto adicionado.","Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                    }
                        relacaoDeProdutos.addProduto(produto);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,"Selecione o tipo do produto.","Erro!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });


        panel.add(nomeProdutoLabel);
        panel.add(nomeProdutoField);
        panel.add(descricaoLabel);
        panel.add(descricaoField);
        panel.add(quantidadeLabel);
        panel.add(quantidadeField);
        panel.add(precoLabel);
        panel.add(precoField);
        panel.add(tipo);
        panel.add(comboBox);
        panel.add(salvarBTN);
        panel.setVisible(true);
        add(panel);
    }
}
