package br.univali.turma2501.aula04;

import br.univali.turma2501.aula07.NaoAutorizadoException;

public class Aula04 {

    public static void main(String[] args) throws NaoAutorizadoException {
        Cargo c1 = new Cargo("Admin");
        Usuario u1 = new Usuario(1L, "Fred", "fred@yahoo.com", c1);
        Usuario u2 = new Usuario(2L, "Lara", "lara@croft.com", c1);
        Status s1 = new Status(1, "Pendente");
        Status s2 = new Status(2,"Em andamento");
        Tarefa t1 = new TarefaDomestica("Lavar louça", "", u1, "26/03/25", s1, new Aposento("Cozinha"));
        t1.alterarStatus(u1, s2);
        t1 = new TarefaEscolar("Estudar pra prova", "", u2, "26/03/25", s1, "28/03/25", "Matemática");
        t1.alterarStatus(u2, s2);
    }

}
