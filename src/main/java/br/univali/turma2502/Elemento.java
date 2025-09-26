package br.univali.turma2502;

public enum Elemento {
    FOGO(1.5),
    AGUA(1.2),
    VENTO(2.0),
    TERRA(1.8);

    public Double fatorDano;

    Elemento(Double fatorDano) {
        this.fatorDano = fatorDano;
    }

    public String toString() {
        return this.name() + "!!!!";
    }
}
