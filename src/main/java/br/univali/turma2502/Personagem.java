package br.univali.turma2502;

public class Personagem {

    private String nome;
    private int hp;
    private int ataque;
    private int defesa;
    private Arma arma;
    private Acessorio[] acessorios;

    public Personagem(String nome,
                      int hp,
                      int ataque,
                      int defesa) {
        this.hp = hp;
        this.ataque = ataque;
        this.defesa = defesa;
        this.nome = nome;
        this.acessorios = new Acessorio[3];
    }

    public void atacar(Personagem personagem) {
        System.out.println(this.nome +
                " ataca " + personagem.nome);
    }

    public void defender() {
        System.out.println(this.nome + " em defesa");
    }

    public void recuperar(int valor) {
        if (valor > 0) {
            this.hp += valor;
        }
    }

    public String getNome() {
        return nome;
    }

    public void addAcessorio(Acessorio acessorio, int slot) {
        this.acessorios[slot] = acessorio;
    }

    public void usarAcessorio(int slot) {
        this.acessorios[slot].ativar(this);
    }

}
