package br.univali.turma2601.aula10;

import br.univali.turma2601.aula09.Comida;

public class Main {

    public static void main(String[] args) {
        Comida comida = new Comida("Comida qualquer", "", 10.5, 5.4);
        UnidadeMedida quilograma = new UnidadeMedida() {
            public String getSigla() {
                return "Kg";
            }
        };
        UnidadeMedida libra = () -> "Lb";
        Balanca<Comida, UnidadeMedida> balanca = new Balanca<>();
        balanca.pesar(comida, quilograma);
        balanca.pesar(comida, libra);
    }

}
