package br.univali.turma2502;

public class BombaFumaca implements Acessorio {

    public void ativar(Personagem p) {
        System.out.println(p.getNome() + " fugiu da batalha");
    }

}
