package GUI;

import Colecoes.RelacaoDeProdutos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ExibirProdutosPanel extends JPanel{
    RelacaoDeProdutos relacaoDeProdutos;
    DefaultTableModel produtosTabel;

    public ExibirProdutosPanel(RelacaoDeProdutos relacaoDeProdutos){
        JPanel panel = new JPanel(new GridLayout(3, 2));
        this.relacaoDeProdutos = relacaoDeProdutos;
        setBackground(Color.red);
        produtosTabel = new DefaultTableModel();
        produtosTabel.setColumnCount(5);
        produtosTabel.addColumn("Código");
        produtosTabel.addColumn("Nome");
        produtosTabel.addColumn("Descrição");
        produtosTabel.addColumn("Valor");
        produtosTabel.addColumn("Quantidade");


    }
}
