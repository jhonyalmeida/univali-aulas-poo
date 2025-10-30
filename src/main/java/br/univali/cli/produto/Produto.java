package br.univali.cli.produto;

import br.univali.cli.core.Entidade;

public class Produto implements Entidade<Long> {

    private Long id;
    private String nome;
    private Double preco;

    public Produto(Long id, String nome, Double preco) {
        this.id = id;
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
        return nome + " " + preco;
    }

    @Override
    public Long getId() {
        return id;
    }
}
