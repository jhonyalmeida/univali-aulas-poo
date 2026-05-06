package br.univali.turma2601.aula09;

import java.util.Comparator;

public class NomeComparator implements Comparator<Produto> {

    public int compare(Produto o1, Produto o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
