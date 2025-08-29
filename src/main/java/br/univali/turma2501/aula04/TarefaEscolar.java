package br.univali.turma2501.aula04;

import br.univali.turma2501.aula07.NaoAutorizadoException;

public class TarefaEscolar extends Tarefa {

    private String dataEntrega;
    private String disciplina;

    public TarefaEscolar(String nome, String descricao, Usuario responsavel, String dataCriacao, Status status, String dataEntrega, String disciplina) {
        super(nome, descricao, responsavel, dataCriacao, status);
        this.dataEntrega = dataEntrega;
        this.disciplina = disciplina;
    }

    @Override
    public void alterarStatus(Usuario usuario, Status status) throws NaoAutorizadoException {
        System.out.println("-- Tarefa Escolar de " + disciplina + " para entrega em " + dataEntrega + " --");
        if (!status.isMaior(getStatus())) {
            System.out.println("nao pode retroceder status, o tempo não volta");
        }
        super.alterarStatus(usuario, status);
    }
}
