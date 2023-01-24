package Fonte;

public class Item {
    private int quantidade;
    private Produto produto;
    private double valorUnitario;
    private double valorTotal;

    public Item(Produto produto, int quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.valorUnitario = 0;
        this.valorTotal = 0;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
