package br.univali.aula14;

import static org.mockito.Mockito.*;

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
        RandomGenerator randomGenerator = () -> {
            return 6;
        };
        Calculadora calculadora = new Calculadora(randomGenerator);
        int result = calculadora.getAleatorio();
        Assertions.assertEquals(6, result);
    }

    @Test
    void testNumeroAleatorioV2() {
        RandomGenerator randomGenerator = Mockito.mock(RandomGenerator.class);
        when(randomGenerator.getRandomInt()).thenReturn(6);
        Calculadora calculadora = new Calculadora(randomGenerator);
        int result = calculadora.getAleatorio();
        Assertions.assertEquals(6, result);
        when(randomGenerator.getRandomInt()).thenReturn(5);
        result = calculadora.getAleatorio();
        Assertions.assertEquals(5, result);
    }

}