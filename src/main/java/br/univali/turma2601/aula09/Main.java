package br.univali.turma2601.aula09;

import java.util.Scanner;

public class Main {

    Menu menu = new Menu();
    Console console = new Console();

    /**
     * Exercício - implementar opção de ordenar o menu do item mais barato para o mais caro
     * Usuário pode escolher ao listar menu: alfabético por nome ou por preço
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.executar();
    }

    private void executar() {
        System.out.println("Bem vindo");

        Integer opcao = 0;
        while (opcao != 3) {
            System.out.println("1 - Inserir novo produto");
            System.out.println("2 - Listar menu");
            System.out.println("3 - Sair");
            opcao = console.lerInteiro();
            if (opcao == 1) {
                cadastrarProduto();
            }
            if (opcao == 2) {
                listarProdutos();
            }
        }
    }

    private void cadastrarProduto() {
        String nome = console.lerString("Digite o nome:");
        String descricao = console.lerString("Digite o descricao:");
        Double preco = console.lerDouble("Digite o valor:");
        Integer tipo = console.lerInteiro("Digite o tipo de item 1 - Comida ou 2 - Bebida:");

        Produto produto;

        if (tipo == 1) {
            Double peso = console.lerDouble("Digite o peso da comida:");
            produto = new Comida(nome, descricao, preco, peso);
            menu.adicionarProduto((Comida) produto);
        }

        if (tipo == 2) {
            Double litros = console.lerDouble("Digite quantos litros:");
            produto = new Bebida(nome, descricao, preco, litros);
            menu.adicionarProduto((Bebida) produto);
        }
    }

    private void listarProdutos() {
        String exibicao = menu.exibir(new NomeComparator());
        System.out.println(exibicao);
    }

}
