package br.univali.questions;

/**

    2) Qual é a saída do programa abaixo?

    a) "Som de animal"
    b) "Au Au"
    c) Uma exceção é lançada por conflito de métodos com mesmo nome
    d) Nada é exibido

 */

public class Exercicio02 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        troca(animal);
        animal.emitirSom();
    }

    private static void troca(Animal animal) {
        animal = new Cachorro();
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
