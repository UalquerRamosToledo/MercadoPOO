package GUI;

import Colecoes.RelacaoDeNotasFiscais;
import Colecoes.RelacaoDeProdutos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Esta é a classe para a Interface Grafica de gerenciar Notas Fiscais.
 *
 * @author Deivid, Ualquer
 * @version 1.0
 */

public class NotaFiscalPanel extends JPanel {
    JPanel panel;
    JLabel bucarNFLabel, dataNFLabel;
    JTextField buscarNFField, dataNFField;
    RelacaoDeProdutos relacaoDeProdutos;
    RelacaoDeNotasFiscais relacaoDeNotasFiscais;
    JButton buscarNFBTN, editarNFBTN;
    JInternalFrame visualizacao;
    public NotaFiscalPanel(RelacaoDeProdutos relacaoDeProdutos, RelacaoDeNotasFiscais relacaoDeNotasFiscais){
        this.relacaoDeProdutos = relacaoDeProdutos;
        this.relacaoDeNotasFiscais = relacaoDeNotasFiscais;

        panel = new JPanel(new GridLayout(7, 2));

        bucarNFLabel = new JLabel("Código da Nota Fiscal:");
        buscarNFField = new JTextField();
        buscarNFBTN = new JButton("Buscar");

        dataNFLabel = new JLabel("Buscar Total de Vendas por Data: ");
        dataNFField = new JTextField();
        editarNFBTN = new JButton("Editar");
        visualizacao = new JInternalFrame();

        buscarNFBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo = Integer.parseInt(buscarNFField.getText());
                try {
                    JOptionPane.showMessageDialog(null,relacaoDeNotasFiscais.getNotaFiscal(codigo).toString(),"Total!", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,"Não encontrada!","Erro!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        panel.add(bucarNFLabel);
        panel.add(buscarNFField);
        panel.add(buscarNFBTN);
        panel.add(dataNFLabel);
        panel.add(dataNFField);
        panel.add(editarNFBTN);
        panel.add(visualizacao);
        panel.setVisible(true);
        add(panel);
    }
}
