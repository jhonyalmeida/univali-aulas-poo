package br.univali.turma2601.aula12;

import java.util.ArrayList;
import java.util.List;

public class Corrida {

    /**
     * Exercícios aula 12 - Desafio extra
     *
     * Ler sobre threads na apresentação de temas complementares no AVA.
     * - O método start inicia uma nova thread que executa em paralelo.
     * - O método join faz com que a thread atual espere pela outra terminar.
     *
     * Ao final da corrida (todas as threads finalizadas), exibir o pódio dos três primeiros colocados de acordo com
     * sua ordem de chegada. Pode modificar a classe Cavalo se julgar necessário. Lembrar que duas threads podem modificar
     * uma variável de forma concorrente.
     *
     */
    public static void main(String[] args) {
        new Corrida();
    }

    public Corrida() {
        Integer distanciaTotal = 100;

        List<Cavalo> cavalos = new ArrayList<>();
        cavalos.add(new Cavalo("Blue", distanciaTotal));
        cavalos.add(new Cavalo("Green", distanciaTotal));
        cavalos.add(new Cavalo("Red", distanciaTotal));
        cavalos.add(new Cavalo("Yellow", distanciaTotal));

        List<Thread> threads = new ArrayList<>();
        for (Cavalo cavalo : cavalos) {
            threads.add(new Thread(cavalo));
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
