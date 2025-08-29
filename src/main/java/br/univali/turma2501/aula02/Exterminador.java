package br.univali.turma2501.aula02;

public class Exterminador extends Robo implements Saltador, Atirador {
    
    private Arma arma;
    
    public Exterminador(String nome,
            double altura, double peso, Arma arma) {
        super(nome, altura,peso);
        this.arma = arma;
    }
    
    public void atirar() {
        arma.atirar();
    }
    
    public void recarregar() {
        arma.recarregar();
    }
    
    @Override
    public void pular() {
        double alturaPulo = altura * 2;
        System.out.println("Pulando " + alturaPulo + " metros");
    }
    
}
