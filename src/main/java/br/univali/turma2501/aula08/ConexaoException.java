package br.univali.turma2501.aula08;

public class ConexaoException extends RuntimeException {

    public ConexaoException(Exception cause, String message) {
        super(message, cause);
    }

}
