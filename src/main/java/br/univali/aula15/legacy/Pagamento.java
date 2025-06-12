package br.univali.aula15.legacy;

public class Pagamento {

    private MeioPagamento meioPagamento;
    private Double valor;

    public Pagamento(MeioPagamento meioPagamento, Double valor) {
        this.meioPagamento = meioPagamento;
        this.valor = valor;
    }

    public MeioPagamento getMeioPagamento() {
        return meioPagamento;
    }

    public Double getValor() {
        return valor;
    }

    public String toString() {
        return getMeioPagamento() + " - " + getValor();
    }

}
