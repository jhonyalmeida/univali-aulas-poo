package br.univali.turma2501.aula03;

public class Etapa {

    private int ordem;
    private Disciplina[] disciplinas;

    public Etapa(int ordem, int numeroDisciplinas) {
        this.ordem = ordem;
        this.disciplinas = new Disciplina[numeroDisciplinas];
    }

    public boolean addDisciplina(Disciplina disciplina) {
        for (int i = 0; i < this.disciplinas.length; i++) {
            if (this.disciplinas[i] == null) {
                this.disciplinas[i] = disciplina;
                return true;
            }
        }
        return false;
    }

}
