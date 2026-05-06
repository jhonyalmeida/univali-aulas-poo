package br.univali.turma2601.aula09;

public class Comida extends Produto {

    private Double peso;


    public Comida(String nome, String descricao, double preco, Double peso) {
        super(nome, descricao, preco);
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Comida{" +
                "peso=" + peso +
                "} " + super.toString();
    }
}
