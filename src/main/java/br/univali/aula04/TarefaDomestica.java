package br.univali.aula04;

public class TarefaDomestica extends Tarefa {

    Aposento aposento;

    public TarefaDomestica(String nome, String descricao, Usuario responsavel, String dataCriacao, Status status, Aposento aposento) {
        super(nome, descricao, responsavel, dataCriacao, status);
        this.aposento = aposento;
    }

    @Override
    public boolean alterarStatus(Usuario usuario, Status status) {
        System.out.println("-- Tarefa Doméstica na(o) " + aposento + " --");
        return super.alterarStatus(usuario, status);
    }

    public Aposento getAposento() {
        return aposento;
    }
}
