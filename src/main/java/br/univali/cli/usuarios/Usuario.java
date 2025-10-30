package br.univali.cli.usuarios;

import br.univali.cli.core.Entidade;

public class Usuario implements Entidade<String> {

    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return nome + " " + email;
    }

    @Override
    public String getId() {
        return nome;
    }
}
