package br.univali.questions;

import java.util.UUID;

/**

    4) Qual é a saída do programa abaixo?

    a) "notebook legal"
    b) "NOTEBOOK LEGAL"
    c) Uma exceção é lançada por acesso ilegal do campo nome
    d) Nada é exibido

 */

public class Exercicio04 {

    public static void main(String[] args) {
        new Exercicio04();
    }

    public Exercicio04() {
        Produto produto = new Produto("notebook legal");
        formatar(produto);
        System.out.println(produto.getNome());
    }

    private void formatar(Produto produto) {
        produto.setNome(produto.getNome().toUpperCase());
    }

}

class Produto {

    private UUID id;
    private String nome = "";

    public Produto(String nome) {
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
        if (nome == null || nome.isEmpty()) {
            throw new RuntimeException("Nome não pode ser vazio");
        }
        this.nome = nome;
    }

}
