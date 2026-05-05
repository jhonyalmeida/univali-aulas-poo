package br.univali.turma2601.aula09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Digite o nome:");
            String nome = sc.nextLine();

            System.out.println("Digite a descrição:");
            String descricao = sc.nextLine();

            System.out.println("Digite o preço:");
            Double preco = Double.parseDouble(sc.nextLine());

            System.out.println("Digite o tipo de item 1 - Comida ou 2 - Bebida:");
            Integer tipo = Integer.parseInt(sc.nextLine());

            Produto produto;

            if (tipo == 1) {
                System.out.println("Digite o peso da comida");
                Double peso = Double.parseDouble(sc.nextLine());

                produto = new Comida(nome, descricao, preco, peso);
                menu.adicionarProduto((Comida) produto);
            }

            if (tipo == 2) {
                System.out.println("Digite quantos litros tem a bebida");
                Double litros = Double.parseDouble(sc.nextLine());

                produto = new Bebida(nome, descricao, preco, litros);
                menu.adicionarProduto((Bebida) produto);
            }

        }

    }

}
