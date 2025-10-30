package br.univali.threads;

import java.util.concurrent.TimeUnit;

public class ExemploThreads {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            System.out.println("t1");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("t2");
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("t-main");
    }

}