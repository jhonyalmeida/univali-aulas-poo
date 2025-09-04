package br.univali.questions;

import java.util.ArrayList;
import java.util.List;

/**

    10) Qual a saída do programa?

    a) "Lista de itens não pode ser vazia"
    b) "Lista de itens não pode ser vazia..."
    c) "Lista de itens não pode ser nula..."
    d) "Itens adicionados"

    [Bônus]
    10.1) Se descomentarmos a linha 33, qual será a saída do programa?

    a) O programa não compila mais
    b) "..."
    c) "Itens adicionados"
    d) "Itens adicionados..."

 */

public class Exercicio10 {
    public static void main(String[] args) {
        new Exercicio10();
    }

    public Exercicio10() {
        NotaFiscal notaFiscal = new NotaFiscal();
        List<Item> itens = new ArrayList<>();
        itens.add(new Item("Item 1"));
        try {
            notaFiscal.setItens(itens);
            System.out.print("Itens adicionados");
        } catch (ItensNullException e) {
            System.out.print("Lista de itens não pode ser nula");
        } catch (ItensVazioException e) {
            System.out.print("Lista de itens não pode ser vazia");
        } finally {
            System.out.print("...");
        }
    }
}

class NotaFiscal {
    private List<Item> itens;

    public void setItens(List<Item> itens) {
        if (itens == null) {
            throw new ItensNullException();
        }
        if (itens .isEmpty()) {
            throw new ItensVazioException();
        }
        this.itens = itens;
    }
}

class Item {
    private String descricao;

    public Item(String descricao) {
        this.descricao = descricao;
    }
}

class ItensNullException extends RuntimeException {
    public ItensNullException() {}
}

class ItensVazioException extends RuntimeException {
    public ItensVazioException() {}
}
