package br.univali.aula04;

import br.univali.aula07.NaoAutorizadoException;

public class TarefaDomestica extends Tarefa {

    Aposento aposento;

    public TarefaDomestica(String nome, String descricao, Usuario responsavel, String dataCriacao, Status status, Aposento aposento) {
        super(nome, descricao, responsavel, dataCriacao, status);
        this.aposento = aposento;
    }

    @Override
    public void alterarStatus(Usuario usuario, Status status) throws NaoAutorizadoException {
        System.out.println("-- Tarefa Doméstica na(o) " + aposento + " --");
        super.alterarStatus(usuario, status);
    }

    public Aposento getAposento() {
        return aposento;
    }
}
