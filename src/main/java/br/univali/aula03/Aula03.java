package br.univali.aula03;

public class Aula03 {

    public static void main(String[] args) {
        Curso curso = new Curso(1, "Ciência da Computação", 10);
        Etapa etapa1 = new Etapa(1, 5);
        Disciplina disciplina1 = new Disciplina("Programação Orientada a Objetos");
        curso.addEtapa(etapa1);
        etapa1.addDisciplina(disciplina1);
        System.out.println(curso);
    }

}
