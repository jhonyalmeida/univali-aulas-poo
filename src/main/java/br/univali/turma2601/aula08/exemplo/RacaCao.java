package br.univali.turma2601.aula08.exemplo;

import br.univali.turma2601.aula07.NomeavelPlus;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class RacaCao implements Comparable<RacaCao> {

    private String nome;
    private String descricao;

    public RacaCao(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) throws ValidacaoException {
        if (descricao == null || descricao.isEmpty()) {
            throw new ValidacaoException("descricao nao pode ser vazia");
        }
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RacaCao)) return false;
        RacaCao racaCao = (RacaCao) o;
        try {
            return this.nome.equals(racaCao.nome);
        } catch (NullPointerException e) {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return nome + " - " + descricao;
    }


    public int compareTo(RacaCao o) {
        try {
            return this.nome.compareTo(o.nome);
        } catch (NullPointerException e) {
            throw new RuntimeException("Ops, bug aqui", e);
        }
    }
}
