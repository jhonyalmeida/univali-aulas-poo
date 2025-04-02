package br.univali.aula05;

import br.univali.aula04.Tarefa;
import br.univali.aula04.Usuario;

import java.util.Scanner;

public class VerTarefa implements Comando {

    @Override
    public void executar(Usuario usuario, Scanner sc, BancoDados bancoDados) {
        System.out.println("Qual tarefa deseja visualizar?");
        int id = Integer.parseInt(sc.nextLine());
        Tarefa tarefa = bancoDados.get(id);
        System.out.println(tarefa.toString());
    }

}
