package GUI;

import Colecoes.RelacaoDeNotasFiscais;
import Colecoes.RelacaoDeProdutos;

import javax.swing.*;
import java.awt.*;
/**
 * Esta é a classe para a Interface Grafica para Exibir as Notas Fiscais.
 *
 * @author Deivid, Ualquer
 * @version 1.0
 */
public class ExibirNotasFiscaisPanel extends JPanel{
    RelacaoDeNotasFiscais relacaoDeNotasFiscais;
    public ExibirNotasFiscaisPanel(RelacaoDeNotasFiscais relacaoDeNotasFiscais){
        this.relacaoDeNotasFiscais = relacaoDeNotasFiscais;
        JTextArea textArea = new JTextArea(relacaoDeNotasFiscais.toString());
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(700, 500));
        JOptionPane.showMessageDialog(null, scrollPane, "Lista de Notas Fiscais", JOptionPane.INFORMATION_MESSAGE);
    }
}
