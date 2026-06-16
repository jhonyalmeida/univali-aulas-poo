package br.univali.turma2601.aula15;

public interface FotoLoader {

    boolean match(String path);

    Foto load(String path);

}
