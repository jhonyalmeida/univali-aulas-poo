package br.univali.turma2601.aula02;

public class Aplicacao {

    public static void main(String[] args) {
        Robo r1 = new Robo("Maria", 1.77, 60.5, 2);
        Robo r2 = new Robo("Joao", 1.75, 76.0, 1);
        r1.correr();
        r2.correr();
        Arma a1 = new Arma(18, 18);
        r1.equiparArma(a1);
        r1.atirar();
    }

}