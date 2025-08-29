package br.univali.turma2502;

public class Medalhao implements Acessorio {
    public void ativar(Personagem p) {
        p.recuperar(5);
        System.out.println("Medalhao ativado");
    }
}
