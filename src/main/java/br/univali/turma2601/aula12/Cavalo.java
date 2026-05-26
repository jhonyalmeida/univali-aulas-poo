package br.univali.turma2601.aula12;

import java.util.Random;

public class Cavalo implements Runnable {

    private String nome;
    private Integer distanciaPista;
    private Integer distanciaPercorrida;
    private Random random = new Random();

    public Cavalo(String nome, Integer distanciaPista) {
        this.nome = nome;
        this.distanciaPista = distanciaPista;
        this.distanciaPercorrida = 0;
    }

    @Override
    public void run() {
        while (distanciaPercorrida < distanciaPista) {
            try {
                Thread.sleep(random.nextInt(1000));
                distanciaPercorrida = distanciaPercorrida + random.nextInt(10);
                System.out.println(nome + " percorreu " + distanciaPercorrida + "m");
            } catch (InterruptedException e) {
                System.out.println(nome + " não conseguiu finalizar a corrida");
                return;
            }
        }
        System.out.println(nome + " alcançou a linha de chegada!");
    }
}
