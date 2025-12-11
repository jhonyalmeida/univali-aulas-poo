package br.univali.turma2502.aula18.exemplo;

public class CalculadoraFrete {

    public double calcular(String tipoFrete, double distancia, double peso) {
        double taxaTipo;
        if (tipoFrete.equals("Retirada")) {
            taxaTipo = 0.0;
        }
        else if (tipoFrete.equals("Normal")) {
            taxaTipo = peso * 1.2;
        }
        else if (tipoFrete.equals("Expresso")) {
            taxaTipo = peso * 1.5;
        }
        else {
            throw new IllegalArgumentException("Tipo de frete desconhecido");
        }
        return distancia * 1.5 + taxaTipo;
    }

}
