package Fonte;

public class Item {
    private int quantidade;
    private Produto produto;
    private double preco;
    private double valorTotal;

    public Item(Produto produto, int quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.preco = produto.getPreco();
        this.valorTotal = produto.getPreco() * quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        valorTotal = produto.getPreco() * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Item: " + "Quantidade: " + quantidade + ", Produto: " + produto.getNome() + ", Valor Unitário: " + preco + ", Preço: " + valorTotal;
    }
}
