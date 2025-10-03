package br.univali.cli.usuarios;

import br.univali.cli.menu.Acao;

public class AcaoListarUsuario implements Acao {

    private ServicoUsuario servicoUsuario;

    public AcaoListarUsuario(ServicoUsuario servicoUsuario) {
        this.servicoUsuario = servicoUsuario;
    }

    @Override
    public void executar() {
        servicoUsuario.listarUsuarios();
    }
}
