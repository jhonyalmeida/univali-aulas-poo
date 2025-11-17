package br.univali.turma2501.aula14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CalculadoraTest {

    @Test
    void testSomar() {
        Calculadora calculadora = new Calculadora();
        int a = 6;
        int b = 3;
        int result = calculadora.somar(a, b);
        Assertions.assertEquals(9, result);
    }

    @Test
    void testDividirPorZero() {
        Calculadora calculadora = new Calculadora();
        int a = 6;
        int b = 0;
        Assertions.assertThrows(
                CalculadoraException.class,
                () -> calculadora.dividir(a, b));
    }

    @Test
    void testNumeroAleatorio() {
        RandomGenerator randomGenerator = () -> 6;
        int a = 15;
        Calculadora calculadora = new Calculadora(randomGenerator);
        int result = calculadora.somarAleatorio(a);
        Assertions.assertEquals(21, result);
    }

    @Test
    void testNumeroAleatorioV2() {
        RandomGeneratorImpl mock = Mockito.mock(RandomGeneratorImpl.class);
        Mockito.when(mock.getRandomInt()).thenReturn(7);
        Calculadora calculadora = new Calculadora(mock);
        int a = 14;

        int soma = calculadora.somarAleatorio(a);

        Assertions.assertEquals(21, soma);
        Mockito.verify(mock, Mockito.times(1)).getRandomInt();
    }

}