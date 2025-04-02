package br.univali.aula05;

import br.univali.aula04.Tarefa;

public abstract class BancoDados {

    int[] vetorId = new int[10];

    public String helloWorld() {
        return "Hello World";
    }

    abstract Tarefa get(int id);

    abstract int salvar(Tarefa tarefa);

}
