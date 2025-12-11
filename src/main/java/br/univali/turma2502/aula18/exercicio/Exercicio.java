package br.univali.turma2502.aula18.exercicio;

public class Exercicio {


    /**
     * Modifique o código-fonte para usar o padrão Strategy, mantendo as regras existentes:
     * - Se pagamento for à vista no PIX, aplicar 5% de desconto.
     * - Se pagamento for à vista no cartão de crédito, manter preco original.
     * - Se pagamento for parcelado em 2x ou mais no cartão de crédito, aplicar acréscimo de 2% sobre preco para cada parcela extra.
     *
     * Considere que as únicas opções de pagamento para este exercício são PIX e cartão de crédito, e que o PIX não suporta parcelamento.
     */
    public static void main(String[] args) {
        CalculadoraPreco calculadora = new CalculadoraPreco();
        double preco = 120.0;

        System.out.println("Valor com Pix: " + calculadora.calcular(preco, "PIX", 1));

        System.out.println("Valor no Cartão à Vista: " + calculadora.calcular(preco, "CARTAO_CREDITO", 1));

        System.out.println("Valor no Cartão em 3x: " + calculadora.calcular(preco, "CARTAO_CREDITO", 3));
    }

}
