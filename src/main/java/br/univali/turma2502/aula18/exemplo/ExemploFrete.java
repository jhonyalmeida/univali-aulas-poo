package br.univali.turma2502.aula18.exemplo;

public class ExemploFrete {

    public static void main(String[] args) {
        CalculadoraFrete calculadora = new CalculadoraFrete();
        double peso = 10.0;
        double distancia = 135.0;

        System.out.println("Frete Normal: " + calculadora.calcular("Normal", distancia, peso));

        System.out.println("Frete Expresso: " + calculadora.calcular("Expresso", distancia, peso));

        System.out.println("Retirada na Loja: " + calculadora.calcular("Retirada", distancia, peso));
    }

}
