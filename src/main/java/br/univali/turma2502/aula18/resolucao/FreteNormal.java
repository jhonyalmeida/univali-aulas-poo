package br.univali.turma2502.aula18.resolucao;

public class FreteNormal implements FreteStrategy {

    public double calcularFrete(double peso) {
        return peso * 1.2;
    }

}
