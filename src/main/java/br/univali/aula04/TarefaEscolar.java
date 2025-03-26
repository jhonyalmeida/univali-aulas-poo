package br.univali.aula04;

public class TarefaEscolar extends Tarefa {

    private String dataEntrega;
    private String disciplina;

    public TarefaEscolar(String nome, String descricao, Usuario responsavel, String dataCriacao, Status status, String dataEntrega, String disciplina) {
        super(nome, descricao, responsavel, dataCriacao, status);
        this.dataEntrega = dataEntrega;
        this.disciplina = disciplina;
    }

    @Override
    public boolean alterarStatus(Usuario usuario, Status status) {
        System.out.println("-- Tarefa Escolar de " + disciplina + " para entrega em " + dataEntrega + " --");
        if (!status.isMaior(getStatus())) {
            System.out.println("nao pode retroceder status, o tempo não volta");
            return false;
        }
        return super.alterarStatus(usuario, status);
    }
}
