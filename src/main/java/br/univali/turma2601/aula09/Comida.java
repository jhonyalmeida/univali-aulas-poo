package br.univali.turma2601.aula09;

import br.univali.turma2601.aula11.Pesavel;

public class Comida extends Produto implements Pesavel {

    private Double peso;


    public Comida(String nome, String descricao, double preco, Double peso) {
        super(nome, descricao, preco);
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "{\"nome\":\"" + getNome() + "\",\"descricao\":\"" + getDescricao() + "\",\"preco\":" + getPreco() + ",\"peso\":" + peso + "}";
    }

    @Override
    public Double getPeso() {
        return this.peso;
    }
}
