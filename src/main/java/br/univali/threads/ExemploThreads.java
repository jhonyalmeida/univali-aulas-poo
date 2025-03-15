package br.univali.threads;

import java.util.concurrent.TimeUnit;

public class ExemploThreads {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t1");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("t2");
        });

        t1.start();
        t2.start();
    }

}