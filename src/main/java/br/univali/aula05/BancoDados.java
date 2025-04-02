package br.univali.aula05;

import br.univali.aula04.Tarefa;

public interface BancoDados {

    Tarefa get(int id);

    int salvar(Tarefa tarefa);

}
