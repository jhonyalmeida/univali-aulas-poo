package br.univali.turma2501.aula02;

public class Robo {

    protected String nome;
    protected double altura;
    protected double peso;

    public Robo(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public void pular() {
        double alturaSalto = altura * 0.5;
        System.out.println("pulando " + alturaSalto + " metros");
    }

}
