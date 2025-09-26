package br.univali.turma2502;

public class PosicaoInvalidaException extends Exception {

    public String a = "Hello";

    public PosicaoInvalidaException() {
        super("Posição de item inválida");
    }

}
