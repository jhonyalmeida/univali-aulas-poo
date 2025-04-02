package br.univali.aula05;

import br.univali.aula04.Usuario;

import java.util.Scanner;

public interface Comando {

    void executar(Usuario usuario, Scanner sc, BancoDados bancoDados);

}
