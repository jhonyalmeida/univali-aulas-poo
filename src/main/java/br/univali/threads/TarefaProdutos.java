package br.univali.threads;

import br.univali.desktop.Product;

import javax.swing.*;
import java.util.List;
import java.util.stream.Collectors;

public class TarefaProdutos implements Runnable {

    private List<Product> products;

    public TarefaProdutos(List<Product> products) {
        this.products = products;
    }

    @Override
    public void run() {
        System.out.println("Tarefa executando em paralelo...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //uso de stream para transformar uma lista de produtos em uma string

        String produtosString = products.stream()
                        .map(product -> product.getName())
                        .collect(Collectors.joining(","));

        JOptionPane.showMessageDialog(null, "Produtos: " + products);
    }
}
