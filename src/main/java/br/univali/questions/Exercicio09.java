package br.univali.questions;

import java.util.Objects;

/**

    9) Qual a saída do programa?

    a) false false
    b) true true
    c) false true
    d) true false

 */

public class Exercicio09 {

    public static void main(String[] args) {
        Livro livro = new Livro("Jogos Vorazes");
        Livro livro2 = new Livro("Jogos Vorazes");
        System.out.print(livro == livro2);
        System.out.print(" " + livro.equals(livro2));
    }

}

class Livro {
    private String nome;

    public Livro(String nome) {
        this.nome = nome;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Livro)) {
            return false;
        }
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome);
    }
}
