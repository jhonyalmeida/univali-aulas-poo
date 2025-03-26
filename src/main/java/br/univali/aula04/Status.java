package br.univali.aula04;

public class Status {

    private Integer ordem;
    private String nome;

    public Status(Integer ordem, String nome) {
        this.nome = nome;
        this.ordem = ordem;
    }

    public boolean isMaior(Status status) {
        return this.ordem > status.ordem;
    }

    @Override
    public String toString() {
        return nome;
    }
}
