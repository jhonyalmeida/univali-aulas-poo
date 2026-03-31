package br.univali.turma2601.aula05;

public class Caminhonete extends Veiculo {

    private Double capacidadeCarga;

    public Caminhonete(String placa, String marca, String modelo, Integer ano, Double capacidadeCarga) {
        super(placa, marca, modelo, ano);
        setCapacidadeCarga(capacidadeCarga);
    }

    public Double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(Double capacidadeCarga) {
        if (capacidadeCarga == null || capacidadeCarga <= 0) {
            return;
        }
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String getTipo() {
        return "Caminhonete";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Carga: %.1f ton", capacidadeCarga);
    }
}