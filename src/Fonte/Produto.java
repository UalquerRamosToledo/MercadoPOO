package Fonte;

public abstract class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;

    public Produto(int codigo, String nome, String descricao, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
}
