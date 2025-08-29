package br.univali.turma2501.aula04;

import java.io.Serializable;

public class Usuario implements Comparable<Usuario>, Serializable {

    private Long id;
    private String nome;
    private String email;
    private Cargo cargo;

    public Usuario(Long id, String nome, String email, Cargo cargo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }

    @Override
    public boolean equals(Object o) {
        if (! (o instanceof Usuario)) {
            return false;
        }
        Usuario usuario = (Usuario) o;
        return id.equals(usuario.id);
    }

    @Override
    public String toString() {
        return String.format("{ \"id\": %d, \"nome\": \"%s\", \"email\": \"%s\" }", id, nome, email);
    }

    @Override
    public int compareTo(Usuario o) {
        if (this.id > o.id) {
            return 1;
        }
        if (this.id < o.id) {
            return -1;
        }
        return 0;
    }
}
