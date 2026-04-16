package br.univali.turma2601.aula07;

public class Funcionario extends Pessoa {

    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return "Funcionario: " + nome;
    }

    public String getCargo() {
        return cargo;
    }
}
