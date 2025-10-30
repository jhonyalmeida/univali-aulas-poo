package br.univali.cli.usuarios;

import br.univali.cli.core.ServicoGenerico;

import java.util.Collection;

public class ServicoUsuario extends ServicoGenerico<String, Usuario> {
    public Collection<Usuario> listar() {
        System.out.println(bancoDados);
        return super.listar();
    }
}
