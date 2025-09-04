package br.univali.questions;

import java.util.UUID;

/**

    3) Que conceito é implementado na classe Curso para controlar o acesso aos atributos?

    a) Abstração
    b) Polimorfismo
    c) Encapsulamento
    d) Herança

 */

public class Exercicio03 {

    public static void main(String[] args) {
        Curso curso = new Curso("Ciência da Computação");
    }

}

class Curso {

    private UUID id;
    private String nome;

    public Curso(String nome) {
        this.id = UUID.randomUUID();
        setNome(nome);
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            throw new RuntimeException("Nome não pode ser vazio");
        }
        this.nome = nome;
    }

}
