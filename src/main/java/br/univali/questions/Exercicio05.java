package br.univali.questions;

import java.util.UUID;

/**

    5) Que conceito é demonstrado neste trecho de código com a variável menu?

    a) Abstração
    b) Polimorfismo
    c) Encapsulamento
    d) Herança

 */


public class Exercicio05 {

    public static void main(String[] args) {
        Menu menu = new MenuConvidado();
        menu.exibir();

        menu = new MenuAdmin();
        menu.exibir();
    }

}

interface Menu {
    void exibir();
}

class MenuConvidado implements Menu {
    public void exibir() {
        System.out.println("menu de convidado");
    }
}

class MenuAdmin implements Menu {
    public void exibir() {
        System.out.println("menu de admin");
    }
}
