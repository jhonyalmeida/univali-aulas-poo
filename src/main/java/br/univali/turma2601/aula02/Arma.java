package br.univali.turma2601.aula02;

public class Arma {

    private Integer numeroBalas;
    private Integer capacidade;

    public Arma(Integer numeroBalas, Integer capacidade) {
        this.numeroBalas = numeroBalas;
        this.capacidade = capacidade;
    }

    public void recarregar() {

    }

    public void atirar() {
        numeroBalas = numeroBalas - 1;
    }

}
