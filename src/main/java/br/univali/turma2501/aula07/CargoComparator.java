package br.univali.turma2501.aula07;

import br.univali.turma2501.aula04.Cargo;

import java.util.Comparator;

public class CargoComparator implements Comparator<Cargo> {

    @Override
    public int compare(Cargo o1, Cargo o2) {
        return o1.getNome().compareTo(o2.getNome());
    }

}
