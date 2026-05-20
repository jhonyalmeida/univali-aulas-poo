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
        return "Comida{" +
                "peso=" + peso +
                "} " + super.toString();
    }

    @Override
    public Double getPeso() {
        return this.peso;
    }
}
