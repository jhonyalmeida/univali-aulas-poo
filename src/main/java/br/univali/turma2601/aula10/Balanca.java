package br.univali.turma2601.aula10;

public class Balanca<T extends Pesavel, U extends UnidadeMedida> {

    public void pesar(T t, U u) {
        System.out.println("Peso: " + t.getPeso() + " " + u.getSigla());
    }

}
