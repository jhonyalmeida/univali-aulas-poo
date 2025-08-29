package br.univali.turma2501.aula15.legacy;

public class Produto {

    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public String toString() {
        return getNome() + " - " + getPreco();
    }
}
