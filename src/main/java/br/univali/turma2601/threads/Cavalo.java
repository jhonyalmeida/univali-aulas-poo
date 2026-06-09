package br.univali.turma2601.threads;

import java.util.Random;

public class Cavalo implements Runnable {

    private String nome;
    private String cor;
    private Integer distanciaPista;
    private volatile Integer distanciaPercorrida;
    private Random random = new Random();

    public Cavalo(String nome, String cor, Integer distanciaPista) {
        this.nome = nome;
        this.cor = cor;
        this.distanciaPista = distanciaPista;
        this.distanciaPercorrida = 0;
    }

    @Override
    public void run() {
        while (distanciaPercorrida < distanciaPista) {
            try {
                Thread.sleep(random.nextInt(1000));
                distanciaPercorrida = Math.min(distanciaPercorrida + random.nextInt(10), distanciaPista);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public Integer getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public Integer getDistanciaPista() {
        return distanciaPista;
    }

    public boolean isTerminou() {
        return distanciaPercorrida >= distanciaPista;
    }
}
