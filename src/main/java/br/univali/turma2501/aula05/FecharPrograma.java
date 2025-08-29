package br.univali.turma2501.aula05;

import br.univali.turma2501.aula04.Usuario;

import java.util.Scanner;

public class FecharPrograma implements Comando {

    @Override
    public void executar(Usuario usuario, Scanner sc, BancoDados bancoDados) {
        System.out.println("Encerrando o programa...");
        System.exit(0);
    }

}
