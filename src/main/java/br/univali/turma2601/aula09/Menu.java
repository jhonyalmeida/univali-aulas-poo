package br.univali.turma2601.aula09;

import java.util.ArrayList;
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

}
