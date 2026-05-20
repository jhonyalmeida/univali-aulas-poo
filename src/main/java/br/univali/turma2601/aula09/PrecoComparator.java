package br.univali.turma2601.aula09;

import java.util.Comparator;

public class PrecoComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getPreco().compareTo(o2.getPreco());
    }
}
