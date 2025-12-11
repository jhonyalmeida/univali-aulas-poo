package br.univali.turma2502.aula18.resolucao;

public class ExemploFrete {

    public static void main(String[] args) {
        CalculadoraFrete calculadora = new CalculadoraFrete();
        double peso = 10.0;
        double distancia = 135.0;

        calculadora.setEstrategia(new FreteNormal());
        System.out.println("Frete Normal: " + calculadora.calcular(distancia, peso));

        calculadora.setEstrategia(new FreteExpresso());
        System.out.println("Frete Expresso: " + calculadora.calcular(distancia, peso));

        calculadora.setEstrategia(new FreteRetirada());
        System.out.println("Retirada na Loja: " + calculadora.calcular(distancia, peso));
    }

}
