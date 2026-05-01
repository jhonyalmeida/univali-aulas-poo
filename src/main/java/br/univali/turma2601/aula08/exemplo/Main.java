package br.univali.turma2601.aula08.exemplo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        PeriodoDia periodoDia = PeriodoDia.MATUTINO;
        System.out.println(periodoDia.getHorarioInicio());

        RacaCao raca1 = new RacaCao("Pinscher", "treme e morde");
        RacaCao raca2 = new RacaCao("Pinscher", "puro amor");
        RacaCao raca3 = new RacaCao("Spitz alemão", "muitos pelos");
        RacaCao raca4 = new RacaCao("Dogger Alemão", "ScoobyDoo");


        try {
            Comparator<RacaCao> comparator = new RacaComparator();
            comparator.compare(null, raca2);
            System.out.println("Comecando");
            Set<RacaCao> racas = new TreeSet<>();
            System.out.println("colecao criada, inserindo dados...");
            racas.add(raca1);
            racas.add(raca2);
            racas.add(raca3);
            racas.add(raca4);
            for (RacaCao raca : racas) {
                System.out.println(raca);
            }
        } catch (NullPointerException e) {
            System.out.println("Null pointer detectado");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            System.out.println("Erro desconhecido");
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Finalizado");
        }
    }

}
