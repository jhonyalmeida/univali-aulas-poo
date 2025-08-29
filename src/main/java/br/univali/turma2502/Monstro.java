package br.univali.turma2502;

public class Monstro extends Personagem {

    public Monstro(String nome,
                   int hp, int ataque, int defesa) {
        super(nome, hp, ataque, defesa);
    }

    public void patrulhar() {
        System.out.println(getNome() + " patrulhando...");
    }

    public void defender() {
        System.out.println(getNome() + " esquivou");
    }

}
