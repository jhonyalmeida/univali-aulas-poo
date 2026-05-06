package br.univali.turma2601.aula09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Menu {

    private List<Comida> comidas;
    private List<Bebida> bebidas;

    public Menu() {
        this.comidas = new ArrayList<>();
        this.bebidas = new ArrayList<>();
    }

    public void adicionarProduto(Comida produto) {
        comidas.add(produto);
    }

    public void adicionarProduto(Bebida produto) {
        bebidas.add(produto);
    }

    public String exibir(Comparator<Produto> produtoComparator) {
        String retorno = "";
        Collections.sort(comidas, produtoComparator);
        Collections.sort(bebidas, produtoComparator);
        for (Comida comida : comidas) {
            retorno = retorno + comida.toString() + "\n";
        }
        for (Bebida bebida : bebidas) {
            retorno = retorno + bebida.toString() + "\n";
        }
        return retorno;
    }

}
