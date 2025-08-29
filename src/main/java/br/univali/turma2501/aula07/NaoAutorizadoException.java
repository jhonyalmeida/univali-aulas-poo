package br.univali.turma2501.aula07;

import br.univali.turma2501.aula04.Usuario;

public class NaoAutorizadoException extends Exception {

    private Usuario owner;

    public NaoAutorizadoException(Usuario usuario) {
        this.owner = usuario;
    }

    @Override
    public String getMessage() {
        return "Só o " + owner + " pode alterar esta tarefa";
    }
}
