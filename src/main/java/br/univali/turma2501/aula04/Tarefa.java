package br.univali.turma2501.aula04;

import br.univali.turma2501.aula07.NaoAutorizadoException;

import java.io.Serializable;
import java.util.Objects;

public class Tarefa implements Serializable {

    private String nome;
    private String descricao;
    private Usuario responsavel;
    private String dataCriacao;
    private String dataAtualizacao;
    private Status status;
    private Usuario[] observadores;

    public Tarefa(String nome, String descricao, Usuario responsavel, String dataCriacao, Status status) {
        this.nome = nome;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataCriacao;
        this.status = status;
    }

    public void alterarStatus(Usuario usuario, Status status) throws NaoAutorizadoException {
        if (!usuario.equals(this.responsavel)) {
            System.out.println("Usuario nao permitido");
            throw new NaoAutorizadoException(this.responsavel);
        }
        this.status = status;
        System.out.println("Status alterado para " + this.status.toString());
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return String.format("{ \"nome\": \"%s\", \"descricao\": \"%s\", \"status\": \"%s\", \"responsavel\": %s }", nome, descricao, status, responsavel);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tarefa)) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(nome, tarefa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
