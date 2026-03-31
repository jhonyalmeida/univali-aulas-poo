package br.univali.turma2601.aula03;

public class Curso {

    public static Integer total = 0;
    public static final String NOME_PADRAO = "Curso ***";

    private String nome;
    private Etapa[] etapas;

    private Integer count = 0;

    public Curso() {
        this.nome = NOME_PADRAO;
    }

    public Curso(String nome, Etapa[] etapas) {
        this.nome = nome;
        this.etapas = etapas;
        total++;
    }

    public static void addEtapa(Etapa etapa){
        total++;
    }

    @Override
    public boolean equals(Object curso){
        if (!(curso instanceof Curso)) return false;
        Curso c = (Curso) curso;
        return this.nome.equals(c.nome);
    }

}
