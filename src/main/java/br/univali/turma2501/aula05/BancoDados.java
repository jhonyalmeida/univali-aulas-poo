package br.univali.turma2501.aula05;

import br.univali.turma2501.aula04.Tarefa;

public interface BancoDados {

    Tarefa get(int id);

    int salvar(Tarefa tarefa);

}
