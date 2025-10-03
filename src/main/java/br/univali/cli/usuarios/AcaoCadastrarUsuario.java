package br.univali.cli.usuarios;

import br.univali.cli.util.Acao;

public class AcaoCadastrarUsuario implements Acao {

    private ServicoUsuario servicoUsuario;

    public AcaoCadastrarUsuario(ServicoUsuario servicoUsuario) {
        this.servicoUsuario = servicoUsuario;
    }

    @Override
    public void executar() {
        servicoUsuario.cadastrarUsuario();
    }
}
