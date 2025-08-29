package br.univali.turma2501.aula04;

import java.io.Serializable;
import java.util.Objects;

public class Cargo implements Serializable {

    private String nome;

    public Cargo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cargo)) {
            return false;
        }
        Cargo cargo = (Cargo) o;
        return nome.equals(cargo.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
