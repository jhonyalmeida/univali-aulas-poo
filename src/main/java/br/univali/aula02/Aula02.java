package br.univali.aula02;

public class Aula02 {

    public static void main(String[] args) {
        Arma a1 = new Arma(16, 0);
        Atirador a2 = new ArcoFlecha();
        a1.atirar();
        a2.atirar();
        
        Robo r1 = new Robo("WALL-E", 0.6, 70);
        r1.pular();
        
        Saltador e1 = new Exterminador("T-800", 2.1, 120, a1);
        e1.pular();
        r1 = (Robo) e1;
        r1.pular();
        
        Exterminador e2 = (Exterminador)r1;
        e2.recarregar();
        e2.atirar();
    }
    
}
