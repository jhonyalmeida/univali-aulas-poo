package br.univali.turma2501.aula14;

public class Calculadora {

    private RandomGenerator randomGenerator;

    public Calculadora() {

    }

    public Calculadora(RandomGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
    }

    public int somar(Integer a, Integer b) {
        return a + b;
    }

    public int dividir(Integer a, Integer b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new CalculadoraException();
        }
    }

    public int somarAleatorio(Integer numero) {
        return numero + randomGenerator.getRandomInt();
    }

}
