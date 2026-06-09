package br.univali.turma2601.threads;

import java.util.ArrayList;
import java.util.List;

public class Corrida {

    /**
     * Exercícios aula 13 - Desafio extra
     *
     * Ler sobre threads na apresentação de temas complementares no AVA, pesquisar sobre compartilhamento de dados
     * entre threads.
     *
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
        cavalos.add(new Cavalo("Azulão", "blue", distanciaTotal));
        cavalos.add(new Cavalo("Verdão", "green", distanciaTotal));
        cavalos.add(new Cavalo("Vermelhão", "red", distanciaTotal));
        cavalos.add(new Cavalo("Amarelão", "yellow", distanciaTotal));

        VisualizadorCorrida visualizador = new VisualizadorCorrida(cavalos);
        Thread threadVisualizador = new Thread(visualizador);
        threadVisualizador.start();

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

        visualizador.parar();
        try {
            threadVisualizador.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
