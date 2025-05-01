package br.univali.threads;

public class Tarefa implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("Tarefa executando em paralelo...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
