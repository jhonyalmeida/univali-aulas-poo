package br.univali.questions;

/**

    8) Qual a saída do programa?

    a) "Exibindo personagem"
    b) "Exibindo inimigo"
    c) "Exibindo aliado"
    d) Uma exceção de conflito de métodos é lançada

*/

public class Exercicio08 {

    public static void main(String[] args) {
        new Exercicio08();
    }

    public Exercicio08() {
        Personagem p = new Aliado();
        exibir(p);
    }

    private void exibir(Personagem p) {
        System.out.println("Exibindo personagem");
    }

    private void exibir(Inimigo p) {
        System.out.println("Exibindo inimigo");
    }

    private void exibir(Aliado p) {
        System.out.println("Exibindo aliado");
    }

}

abstract class Personagem {

}

class Aliado extends Personagem {

}

class Inimigo extends Personagem {

}
