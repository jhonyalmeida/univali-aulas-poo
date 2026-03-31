package br.univali.turma2601.aula03;

public class Main {

    public static void main(String[] args) {
        Etapa[] etapas = new Etapa[5];
        Curso curso = new Curso(
                "Engenharia da Computação", etapas);
        curso.addEtapa(new Etapa());
        curso.addEtapa(new Etapa());
        Curso curso2 = new Curso(
                "Engenharia da Computação", etapas);
        System.out.println(Curso.total);
        System.out.println(Curso.NOME_PADRAO);
        System.out.println(Math.sqrt(144));
        System.out.println(curso == curso2);
        System.out.println(curso.equals(curso2));
    }

}
