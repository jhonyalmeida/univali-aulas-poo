package br.univali.turma2501.aula05;

import br.univali.turma2501.aula04.Tarefa;

public class BancoDadosVetor implements BancoDados {

    private Tarefa[] tarefas = new Tarefa[10];
    private int id = 0;

    @Override
    public Tarefa get(int id) {
        return tarefas[id];
    }

    @Override
    public int salvar(Tarefa tarefa) {
        int idAtual = id;
        tarefas[idAtual] = tarefa;
        id++;
        return idAtual;
    }
}
