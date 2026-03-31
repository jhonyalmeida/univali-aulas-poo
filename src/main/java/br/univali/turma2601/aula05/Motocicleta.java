package br.univali.turma2601.aula05;

public class Motocicleta extends Veiculo {

    private Integer cilindradas;

    public Motocicleta(String placa, String marca, String modelo, Integer ano, Integer cilindradas) {
        super(placa, marca, modelo, ano);
        setCilindradas(cilindradas);
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        if (cilindradas == null || cilindradas <= 0) {
           return;
        }
        this.cilindradas = cilindradas;
    }

    @Override
    public String getTipo() {
        return "Motocicleta";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Cilindradas: %dcc", cilindradas);
    }
}