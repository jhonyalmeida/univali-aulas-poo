package br.univali.cli.menu;

import br.univali.cli.usuarios.ServicoUsuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private List<Opcao> opcoes;

    public Menu(Scanner scanner, List<Opcao> opcoes) {
        this.scanner = scanner;
        this.opcoes = opcoes;
    }

    public void exibirOpcoes() {
        System.out.println("Digite o número da opção desejada:");
        for (Opcao opcao : opcoes) {
            System.out.println(opcao.exibir());
        }

        int input = -1;
        while (input != 0) {
            input = scanner.nextInt();
            if (input == 0) {
                System.exit(0);
            }
            boolean executou = false;
            for (Opcao opcao : opcoes) {
                if (opcao.checar(input)) {
                    executou = true;
                    break;
                }
            }
            if (!executou) {
                System.out.println("Opção inválida");
            }
        }
    }

}
