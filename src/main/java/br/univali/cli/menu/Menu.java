package br.univali.cli.menu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private Map<Integer, Opcao> opcoes;

    public Menu(Scanner scanner, List<Opcao> opcoes) {
        this.scanner = scanner;
        this.opcoes = new HashMap<>();
        for (Opcao opcao : opcoes) {
            this.opcoes.put(opcao.getCodigo(), opcao);
        }
    }

    public void exibirOpcoes() {
        System.out.println("Digite o número da opção desejada:");
        for (Opcao opcao : opcoes.values()) {
            System.out.println(opcao.exibir());
        }

        int input = -1;
        while (input != 0) {
            input = scanner.nextInt();
            if (input == 0) {
                System.exit(0);
            }
            Opcao opcao = opcoes.get(input);
            if (opcao == null) {
                System.out.println("Opção inválida");
            } else {
                opcao.checar(input);
            }
        }
    }

}
