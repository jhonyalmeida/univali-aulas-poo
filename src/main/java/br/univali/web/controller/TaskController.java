package br.univali.web.controller;

import br.univali.web.service.TaskService;
import io.javalin.http.Context;

public class TaskController {

    private TaskService taskService;

    public void listarTarefas(Context ctx) {

    }

    public void criarTarefa(Context ctx) {
        ctx.result("Tarefa salva com sucesso!");
    }

}
