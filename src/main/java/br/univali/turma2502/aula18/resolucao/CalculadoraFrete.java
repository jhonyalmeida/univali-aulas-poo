package br.univali.turma2502.aula18.resolucao;

// Context
public class CalculadoraFrete {

    private FreteStrategy estrategia;

    public void setEstrategia(FreteStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(double distancia, double peso) {
        return distancia * 1.5 + estrategia.calcularFrete(peso);
    }

}
