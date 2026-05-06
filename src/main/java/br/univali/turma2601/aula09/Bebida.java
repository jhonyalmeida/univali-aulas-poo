package br.univali.turma2601.aula09;

public class Bebida extends Produto {

    private Double litros;


    public Bebida(String nome, String descricao, double preco, Double litros) {
        super(nome, descricao, preco);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "litros=" + litros +
                '}';
    }
}
