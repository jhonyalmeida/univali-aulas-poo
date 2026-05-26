package br.univali.turma2601.aula09;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Comparator;

public class Main {

    Menu menu = new Menu();
    Console console;

    /**
     * Exercícios aula 12
     *
     * 1) Modificar método exibir do Menu para ordenar todos os produtos segundo a ordem estabelecida (nome ou preço),
     * não importa se sejam comidas ou bebidas.
     *
     * 2) Implementar opções para alterar preço de produto e remover produto do catálogo.
     *
     * 3) Reestruturar o programa para extrair os métodos privados para objetos próprios, cada função sendo um objeto
     * separado ao invés de todas estarem implementadas no Main.
     */
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.executar();
    }

    public Main() throws IOException {
        String path = getClass().getResource("/aula09/input.txt").getPath();
        console = new Console(new FileInputStream(path));
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
        int opcaoOrdenacao = console.lerInteiro("1 - Ordem alfabética, 2 - Ordem por preço");

        Comparator<Produto> comparator = new NomeComparator();
        if (opcaoOrdenacao == 1) {
            comparator = new NomeComparator();
        }
        if (opcaoOrdenacao == 2) {
            comparator = new PrecoComparator();
        }
        String exibicao = menu.exibir(comparator);
        System.out.println(exibicao);
    }

}
