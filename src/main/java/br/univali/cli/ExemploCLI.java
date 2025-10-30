package br.univali.cli;

import br.univali.cli.core.ServicoGenerico;
import br.univali.cli.menu.Menu;
import br.univali.cli.menu.Opcao;
import br.univali.cli.produto.Produto;
import br.univali.cli.produto.ServiceProduto;
import br.univali.cli.usuarios.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ExemploCLI {

    public static void main(String[] args) {
        ServicoGenerico<String, Usuario> servico = new ServicoUsuario();
        exemplo(servico);
        servico.listar();

        Usuario usuario = new Usuario("ET Bilu", "bilu@aol.com");
        servico.cadastrar(usuario);
        System.out.println(servico.listar());

        ServiceProduto servicoProduto = new ServiceProduto();
        Produto produto = new Produto(1L, "iPhone 20", 99999.0);
        servicoProduto.cadastrar(produto);
        System.out.println(servicoProduto.listar());

        System.out.println(servicoProduto.get(1L));
    }

    public static void exemplo(ServicoGenerico<String, Usuario> servico) {
        System.out.println("É um serviço genérico");
        servico = new ServicoUsuario();
        servico.cadastrar(new Usuario("Will Smith", "xxx"));
    }

    public static void exemplo(ServicoUsuario servico) {
        System.out.println("É um serviço de usuário");
    }

    public ExemploCLI() {
        Scanner scanner = new Scanner(System.in);
        List<Opcao> opcoes = new ArrayList<>();
        ServicoUsuario servicoUsuario = new ServicoUsuario();
        opcoes.add(new Opcao(1, "1 - Lista usuários", new AcaoListarUsuario(servicoUsuario)));
        opcoes.add(new Opcao(2, "2 - Cadastrar usuário", new AcaoCadastrarUsuario(servicoUsuario)));
        opcoes.add(new Opcao(3, "3 - Excluir usuário", new AcaoExcluirUsuario(servicoUsuario)));
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
