package br.univali.aula08;

public class ConexaoException extends RuntimeException {

    public ConexaoException(Exception cause, String message) {
        super(message, cause);
    }

}
