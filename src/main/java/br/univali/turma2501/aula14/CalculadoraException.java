package br.univali.turma2501.aula14;

public class CalculadoraException extends RuntimeException {

    public CalculadoraException() {
        super("Erro ao dividir por zero");
    }

}
