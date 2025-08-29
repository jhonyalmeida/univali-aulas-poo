package br.univali.turma2501.aula05;

import br.univali.turma2501.aula04.Status;
import br.univali.turma2501.aula04.Tarefa;
import br.univali.turma2501.aula04.Usuario;

import java.util.Scanner;

public class CriarTarefa implements Comando {

    @Override
    public void executar(Usuario usuario, Scanner sc, BancoDados bancoDados) {
        System.out.println("Nome da tarefa: ");
        String nome = sc.nextLine();
        System.out.println("Descrição da tarefa: ");
        String descricao = sc.nextLine();
        Tarefa tarefa = new Tarefa(nome, descricao, usuario, "", new Status(1, "pendente"));
        int id = bancoDados.salvar(tarefa);
        System.out.println("Tarefa criada com o id " + id);
    }

}
