package br.univali.cli;

import br.univali.cli.menu.Menu;
import br.univali.cli.menu.Opcao;
import br.univali.cli.usuarios.AcaoCadastrarUsuario;
import br.univali.cli.usuarios.AcaoListarUsuario;
import br.univali.cli.usuarios.ServicoUsuario;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ExemploCLI {

    public static void main(String[] args) {
        new ExemploCLI();
    }

    public ExemploCLI() {
        Scanner scanner = new Scanner(System.in);
        List<Opcao> opcoes = new ArrayList<>();
        ServicoUsuario servicoUsuario = new ServicoUsuario();
        opcoes.add(new Opcao(1, "1 - Lista usuários", new AcaoListarUsuario(servicoUsuario)));
        opcoes.add(new Opcao(2, "2 - Cadastrar usuário", new AcaoCadastrarUsuario(servicoUsuario)));
        // novas opcoes
        Menu menu = new Menu(scanner, opcoes);
        menu.exibirOpcoes();
    }

    public static void exemplo1() {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        try {
            int numero1 = Integer.parseInt(s1);
            int numero2 = Integer.parseInt(s2);
            System.out.println("O resultado é " + (numero1 * numero2));
        } catch (NumberFormatException e) {
            System.out.println("Número digitado inválido");
        }
    }

}
