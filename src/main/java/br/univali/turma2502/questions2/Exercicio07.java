package br.univali.turma2502.questions2;

/**

    7) Qual a saída do programa?

    a) "atirando com canhão de plasma"
    b) "atirando com null"
    c) "atirando com "
    d) Uma exceção de ponteiro nulo (NullPointerException) é lançada

 */

public class Exercicio07 {

    public static void main(String[] args) {
        Arma arma = new Arma("canhão de plasma");
        Robo robo = new Robo("T-800", arma);
        robo.atirar();
    }

    static class Robo {
        private String nome;
        private Arma arma;

        public Robo(String nome, Arma arma) {
            this.nome = nome;
            arma = arma;
        }

        public void atirar() {
            System.out.println("atirando com " + arma.getNome());
        }
    }

    static class Arma {
        private String nome;

        public Arma(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
    }

}
