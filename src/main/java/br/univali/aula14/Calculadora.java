package br.univali.aula14;

public class Calculadora {

    private RandomGenerator randomGenerator;

    public Calculadora() {

    }

    public Calculadora(RandomGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
    }

    public int somar(int a, int b) {
        return a + b;
    }

    public int dividir(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new CalculadoraException();
        }
    }

    public int getAleatorio() {
        return randomGenerator.getRandomInt();
    }

}
