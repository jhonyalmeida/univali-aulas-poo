package br.univali.turma2601.aula05;

public class Carro extends Veiculo {

    private Integer numeroPortas;

    public Carro(String placa, String marca, String modelo, Integer ano, Integer numeroPortas) {
        super(placa, marca, modelo, ano);
        setNumeroPortas(numeroPortas);
    }

    public Integer getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(Integer numeroPortas) {
        if (numeroPortas == null || numeroPortas < 2 || numeroPortas > 6) {
            return;
        }
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Portas: %d", numeroPortas);
    }
}
