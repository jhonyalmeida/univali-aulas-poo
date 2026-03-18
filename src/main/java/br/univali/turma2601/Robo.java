package br.univali.turma2601;

public class Robo {

    private String nome;
    private Double altura;
    private Double peso;
    private Integer numeroCameras;
    private Arma arma;

    public Robo(String nome, Double peso, Double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public Robo(String nome, Double altura, Double peso, Integer numeroCameras) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.numeroCameras = numeroCameras;
    }

    public void correr() {
        System.out.println(
                "Correndo " + calcularCorrida() + " metros");
    }

    public void saltar() {

    }

    private Double calcularCorrida() {
        return (altura * peso) / 2;
    }

    public void equiparArma(Arma arma) {
        this.arma = arma;
    }

    public void atirar() {
        if (arma != null) {
            arma.atirar();
            System.out.println("Atirando");
        } else {
            System.out.println("Nenhuma arma foi encontrada");
        }
    }

}
