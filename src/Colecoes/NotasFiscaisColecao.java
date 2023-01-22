package Colecoes;

import Fonte.*;
import Interfaces.INotasFiscais;

import java.util.ArrayList;

public class NotasFiscaisColecao implements INotasFiscais {
    private ArrayList<NotaFiscal> relacaoDeNotasFiscais;

    public NotasFiscaisColecao() {


    }

    /**
     * Adiciona uma nota fiscal.
     *
     * @param nf Nota fiscal a ser adicionada.
     * @throws Exception Lança exceção quando a nota fiscal não pode ser adicionada.
     */
    @Override
    public void addNotaFiscal(NotaFiscal nf) throws Exception {
        try{
            relacaoDeNotasFiscais.add(nf);
        }catch (Exception e){
            System.out.println("Não foi possível salvar a NF.");
        }
    }

    /**
     * Remove a nota fiscal com código informado.
     *
     * @param codigo Código da nota fiscal a ser removida.
     * @throws Exception Lança exceção quando não existir nota fiscal com o código informado.
     */
    @Override
    public void removeNotaFiscal(int codigo) throws Exception {

    }

    /**
     * Captura a nota fiscal com o código informado.
     *
     * @param codigo Código da nota fiscal a ser capturada.
     * @return NotaFiscal Nota fiscal com o código informado.
     * @throws Exception Lança exceção quando não existir nota fiscal com o código informado.
     */
    @Override
    public NotaFiscal getNotaFiscal(int codigo) throws Exception {
        return null;
    }

    /**
     * Captura o total da nota fiscal informada.
     *
     * @param codigo Código da nota fiscal.
     * @return O total (soma do valor de todos os items) da nota fiscal com o código informado.
     * @throws Exception Lança exceção quando não existir nota fiscal com o código informado.
     */
    @Override
    public double getTotal(int codigo) throws Exception {
        return 0;
    }

    /**
     * Adiciona um item a nota fiscal com o código informado.
     *
     * @param codigo Código da nota fiscal na qual o item deve ser adicionado.
     * @param item   Item a ser adicionado.
     * @throws Exception Lança exceção quando não existir nota fiscal com o código informado.
     */
    @Override
    public void addItem(int codigo, Item item) throws Exception {

    }

    /**
     * Remove um item da nota fiscal com o código informado.
     *
     * @param codigo Código da nota fiscal na qual o item deve ser removido.
     * @param item   Item a ser removido.
     * @throws Exception Lança exceção quando não existir nota fiscal com o código informado ou
     *                   quando o Item informado não existir.
     */
    @Override
    public void removeItem(int codigo, Item item) throws Exception {

    }
}
