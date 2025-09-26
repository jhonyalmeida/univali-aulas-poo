package br.univali.turma2502;

public class Arma {

    private String nome;
    private int ataque;
    private Elemento elemento;

    public Arma(String nome, int ataque) {
        this.nome = nome;
        this.ataque = ataque;
    }

    public Arma(String nome, int ataque, Elemento elemento) {
        this.nome = nome;
        this.ataque = ataque;
        this.elemento = elemento;
    }

    public int getAtaque() {
        return ataque;
    }

    public Elemento getElemento() {
        return elemento;
    }

}
