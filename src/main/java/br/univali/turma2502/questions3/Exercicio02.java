package br.univali.turma2502.questions3;

/**
 2) Qual é a saída do programa abaixo?

 a) true false
 b) false true
 c) true true
 d) false false

 */

public class Exercicio02 {

    public static void main(String[] args) {
        new Exercicio02();
    }

    public Exercicio02() {
        TipoFrete tipo1 = TipoFrete.NORMAL;
        TipoFrete tipo2 = TipoFrete.NORMAL;
        boolean resultado1 = (tipo1 == tipo2);
        boolean resultado2 = (tipo1.equals(tipo2));
        System.out.print(resultado1 + " " + resultado2);
    }

    enum TipoFrete {
        NORMAL,
        EXPRESSO
    }

}
