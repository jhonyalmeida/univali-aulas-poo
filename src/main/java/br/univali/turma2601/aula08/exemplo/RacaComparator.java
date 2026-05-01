package br.univali.turma2601.aula08.exemplo;

import java.util.Comparator;

public class RacaComparator implements Comparator<RacaCao> {

    @Override
    public int compare(RacaCao o1, RacaCao o2) {
        try {
            return o1.getDescricao().toLowerCase()
                    .compareTo(o2.getDescricao().toLowerCase());
        } catch (NullPointerException e) {
            return -1;
        } finally {
            System.out.println("compareTo finalizado");
        }
    }
}
