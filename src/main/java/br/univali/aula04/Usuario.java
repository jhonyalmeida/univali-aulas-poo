package br.univali.aula04;

import java.util.Objects;

public class Usuario {

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

}
