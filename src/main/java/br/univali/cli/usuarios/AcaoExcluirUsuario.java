package br.univali.cli.usuarios;

import br.univali.cli.util.Acao;

public class AcaoExcluirUsuario implements Acao {

    private ServicoUsuario servicoUsuario;

    public AcaoExcluirUsuario(ServicoUsuario servicoUsuario) {
        this.servicoUsuario = servicoUsuario;
    }

    @Override
    public void executar() {
        servicoUsuario.excluirUsuario();
    }

    public void fazerOutraCoisa() {

    }

}
