package br.univali.questions;

/**

    1) Qual é a saída do programa abaixo?

    a) "Som de animal"
    b) "Au Au"
    c) Uma exceção é lançada por conflito de métodos com mesmo nome
    d) "Som indefinido"

 */

public class Exercicio01 {
    public static void main(String[] args) {
        Animal animal = new Cachorro();
        animal.emitirSom();
    }

    private static void emitirSom(Animal animal) {
        System.out.println("Som indefinido");
    }

    static class Animal {
        void emitirSom() {
            System.out.println("Som de animal");
        }
    }

    static class Cachorro extends Animal {
        void emitirSom() {
            System.out.println("Au Au");
        }
    }
}
