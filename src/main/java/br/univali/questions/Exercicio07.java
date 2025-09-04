package br.univali.questions;

/**

    7) Qual a saída do programa?

    a) "atirando com canhão de plasma"
    b) "atirando com null"
    c) "atirando com "
    d) Uma exceção de ponteiro nulo (NullPointerException) é lançada

 */

public class Exercicio07 {

    public static void main(String[] args) {
        Robo robo = new Robo("T-800");
        Arma arma = new Arma("canhão de plasma");
        robo.atirar();
    }

}

class Robo {
    private String nome;
    private Arma arma;

    public Robo(String nome) {
        this.nome = nome;
    }

    public void atirar() {
        System.out.println("atirando com " + arma);
    }
}

class Arma {
    private String nome;

    public Arma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
