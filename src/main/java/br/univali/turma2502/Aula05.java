package br.univali.turma2502;

public class Aula05 {

    public static void main(String[] args) {
        Monstro m = new Monstro("Ogro", 50, 6, 7);
        m.addFraqueza(new String("Fogo"));
        System.out.println(m);
        Arma arma = new Arma("espada legal", 15, new String("Fogo"));
        Personagem p = new Personagem("Cid", 100, 6, 5);
        p.equipar(arma);
        p.atacar(m);
    }

}
