package br.univali.turma2502;

import java.util.ArrayList;
import java.util.List;

public class Monstro extends Personagem {

    private List<Elemento> fraquezas;

    public Monstro(String nome,
                   int hp, int ataque, int defesa) {
        super(nome, hp, ataque, defesa);
        fraquezas = new ArrayList<>();
    }

    public void patrulhar() {
        System.out.println(getNome() + " patrulhando...");
    }

    public void defender() {
        System.out.println(getNome() + " esquivou");
    }

    public void addFraqueza(Elemento fraqueza) {
        fraquezas.add(fraqueza);
    }

    public String toString(){
        return getNome() + " " + fraquezas;
    }

    public List<Elemento> getFraquezas() {
        return fraquezas;
    }

}
