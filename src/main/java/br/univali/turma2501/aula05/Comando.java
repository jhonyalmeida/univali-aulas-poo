package br.univali.turma2501.aula05;

import br.univali.turma2501.aula04.Usuario;

import java.util.Scanner;

public interface Comando {

    void executar(Usuario usuario, Scanner sc, BancoDados bancoDados);

}
