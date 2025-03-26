package br.univali.aula03;

public class Curso {

    private int codigo;
    private String nome;
    private Etapa[] etapas;

    public Curso(int codigo, String nome, int numeroEtapas) {
        this.codigo = codigo;
        this.nome = nome;
        this.etapas = new Etapa[numeroEtapas];
    }

    public boolean addEtapa(Etapa etapa) {
        for (int i = 0; i < etapas.length; i++) {
            if (etapas[i] == null) {
                etapas[i] = etapa;
                return true;
            }
        }
        return false;
    }

    public String toString() {
        //implementar
        return "me implementar";
    }
}
