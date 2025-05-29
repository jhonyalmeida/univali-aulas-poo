package br.univali.aula13;

public class Pessoa {

    private String nome;
    private Long idade;
    private String nomeMae;

    public Pessoa(String nome, Long idade, String nomeMae) {
        this.nome = nome;
        this.idade = idade;
        this.nomeMae = nomeMae;
    }

    public Pessoa(String nome) {

    }

    public Pessoa(String nome, Long idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static Pessoa criarPessoaComNome(String nome) {
        return new Pessoa(nome);
    }

    public static Pessoa criarPessoaComNomeEIdade(String nome) {
        return new Pessoa(nome);
    }

}
