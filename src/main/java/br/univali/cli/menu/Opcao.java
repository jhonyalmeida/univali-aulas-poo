package br.univali.cli.menu;

public class Opcao {

    private int codigo;
    private String texto;
    private Acao acao;

    public Opcao(int codigo, String texto) {
        this.codigo = codigo;
        this.texto = texto;
    }

    public Opcao(int codigo, String texto, Acao acao) {
        this.codigo = codigo;
        this.texto = texto;
        this.acao = acao;
    }

    public String exibir() {
        return texto;
    }

    public boolean checar(int codigo) {
        if (this.codigo == codigo) {
            this.acao.executar();
            return true;
        }
        return false;
    }

    public void setAcao(Acao acao) {
        this.acao = acao;
    }
}
