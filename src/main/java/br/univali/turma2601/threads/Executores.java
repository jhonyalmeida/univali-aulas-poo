package br.univali.turma2601.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executores {

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Future<String> futureLocalizacao = executor.submit(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                //nada
            }
            return "Itajaí";
        });

        Future<String> futureClima = executor.submit(() -> {
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                //nada
            }
            return "Nublado";
        });

        System.out.println("Loading...");

        String localizacao = futureLocalizacao.get();
        System.out.println("Localizacao: " + localizacao);

        String clima = futureClima.get();

        System.out.println("Você está em " + localizacao + " e aí está " + clima);
    }

}
