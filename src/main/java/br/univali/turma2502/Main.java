package br.univali.turma2502;

public class Main {

    public static void main(String[] args) {
        Personagem p1 = new Personagem(
                "Squall", 12, 10, 10);
        Personagem p2 = new Personagem(
                "Rinoa", 16, 8, 12);
        Acessorio bomba = new BombaFumaca();
        Acessorio medalhao = new Medalhao();
        p1.addAcessorio(bomba, 0);
        p1.addAcessorio(medalhao, 1);
        p1.atacar(p2);
        p1.usarAcessorio(1);
        p1.usarAcessorio(0);
        Personagem m = new Monstro("Slime", 20, 5, 1);
        m.defender();
    }

}
