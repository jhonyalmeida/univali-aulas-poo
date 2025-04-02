package br.univali.aula05;

import br.univali.aula04.Cargo;
import br.univali.aula04.Status;
import br.univali.aula04.Tarefa;
import br.univali.aula04.Usuario;

import java.util.Scanner;

public class Aula05 {

    public static void main(String[] args) {
        Aula05 aula05 = new Aula05();
        aula05.executar();
    }

    private void executar() {
        Usuario usuario =  new Usuario(1L, "Usuario", "usuario@pudim.com.br", new Cargo("admin"));

        BancoDados bancoDados = new BancoDadosVetor();
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("Digite a opcao desejada: ");
            System.out.println("1 - Ver tarefa");
            System.out.println("2 - Criar tarefa");
            System.out.println("3 - Atualizar tarefa");
            System.out.println("4 - Sair");

            opcao = Integer.parseInt(scanner.nextLine());
            Comando comando = null;
            switch (opcao) {
                case 1:
                    comando = new VerTarefa();
                    break;
                case 2:
                    comando = new CriarTarefa();
                    break;
                case 3:
                    //comando = new AtualizarTarefa();
                    System.out.println("Ainda não implementado");
                    break;
                case 4:
                    comando = new FecharPrograma();
                    break;
                default:
                    System.out.println("Comando desconhecido, tente novamente.");
            }
            comando.executar(usuario, scanner, bancoDados);
        }
    }

}
