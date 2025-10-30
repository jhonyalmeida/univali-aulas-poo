package br.univali.threads;

import br.univali.desktop.Product;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TarefaProdutos implements Runnable {

    private List<Product> products;

    public TarefaProdutos(List<Product> products) {
        this.products = products;
    }

    public void run() {
        System.out.println("Tarefa executando em paralelo...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //uso de stream para transformar uma lista de produtos em uma string

        List<Product> products1 = new ArrayList<>();
        products1.add(new Product("Abacate", "", 1));
        products1.add(new Product("Maça", "", 3));
        products1.add(new Product("Beterraba", "", 1));

        List<String> listaProdutos = products.stream()
                .filter(p -> p.getName().startsWith("A"))
                .map(product -> product.getName())
                .collect(Collectors.toList());

        System.out.println("Produtos: " + listaProdutos);
    }
}
