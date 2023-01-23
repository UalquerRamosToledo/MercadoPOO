package Colecoes;

import Fonte.*;
import Interfaces.INotasFiscais;

import java.util.ArrayList;

public class NotasFiscaisColecao implements INotasFiscais {
    private ArrayList<NotaFiscal> relacaoDeNotasFiscais;

    public NotasFiscaisColecao() {
        relacaoDeNotasFiscais = new ArrayList<NotaFiscal>();
    }

    /**
     * Adiciona uma nota fiscal.
     *
     * @param nf Nota fiscal a ser adicionada.
     * @throws Exception Lança exceção quando a nota fiscal não pode ser adicionada.
     */
    @Override
    public void addNotaFiscal(NotaFiscal nf) {
        relacaoDeNotasFiscais.add(nf);
    }

    /**
     * Remove a nota fiscal com código informado.
     *
     * @param codigo Código da nota fiscal a ser removida.
     * @throws Exception Lança exceção quando não existir nota fiscal com o código informado.
     */
    @Override
    public void removeNotaFiscal(int codigo) throws Exception {
        for(NotaFiscal notaFiscal : relacaoDeNotasFiscais){
            if(notaFiscal.getCodigo() == codigo){
                relacaoDeNotasFiscais.remove(notaFiscal);
            }
        }
        throw new IllegalArgumentException("Não foi possível remover! O código informado é inválido!");
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
        for (NotaFiscal notaFiscal : relacaoDeNotasFiscais){
            if(notaFiscal.getCodigo()==codigo){
                return notaFiscal;
            }
        }
        throw new IllegalArgumentException("Código não encontrado!");
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
        for (NotaFiscal notaFiscal : relacaoDeNotasFiscais){
            if(notaFiscal.getCodigo() == codigo){
                return notaFiscal.valorTotalNF();
            }
        }
        throw new IllegalArgumentException("Código não encontrado!");
    }

    /**
     * Adiciona um item a nota fiscal com o código informado.
     *
     * @param codigo Código da nota fiscal na qual o item deve ser adicionado.
     * @param produto   Item a ser adicionado.
     * @throws Exception Lança exceção quando não existir nota fiscal com o código informado.
     */
    @Override
    public void addItem(int codigo, Produto produto) throws Exception {
        for (NotaFiscal notaFiscal : relacaoDeNotasFiscais){
            if (notaFiscal.getCodigo() == codigo){
                notaFiscal.adicionarProduto(produto);
            }
        }
        throw new IllegalArgumentException("Código não encontrado!");
    }

    /**
     * Remove um item da nota fiscal com o código informado.
     *
     * @param codigo Código da nota fiscal na qual o item deve ser removido.
     * @param produto   Item a ser removido.
     * @throws Exception Lança exceção quando não existir nota fiscal com o código informado ou
     *                   quando o Item informado não existir.
     */
    @Override
    public void removeItem(int codigo, Produto produto) throws Exception {
        for(NotaFiscal notaFiscal : relacaoDeNotasFiscais){
            if (notaFiscal.getCodigo() == codigo){
                notaFiscal.removerProdutoNF(produto);
            }
        }
    }
}
