package br.univali.aula02;

public class Arma implements Atirador {
    private int capacidade;
    private int quantidadeBalas;

    public Arma(int capacidade, int quantidadeBalas) {
        this.capacidade = capacidade;
        this.quantidadeBalas = quantidadeBalas;
    }
    
    @Override
    public void atirar() {
        if (quantidadeBalas == 0) {
            System.out.println("sem balas!!!");
        } else {
            quantidadeBalas--;
            System.out.println("atirando!!!");
        }
    }
    
    public void recarregar() {
        quantidadeBalas = capacidade;
    }
}
