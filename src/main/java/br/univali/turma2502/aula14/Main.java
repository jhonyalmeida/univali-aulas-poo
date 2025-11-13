package br.univali.turma2502.aula14;

public class Main {

    public static void main(String[] args) {
        //Usuario informa a pe
        CalculoRotaStrategy strategy = CalculoRota.CARRO;
        Ponto p1 = new Ponto(23L, 23L);
        Ponto p2 = new Ponto(64L, 64L);
        System.out.println("Calculo: " + strategy.calcularRota(p1, p2));
    }

}
