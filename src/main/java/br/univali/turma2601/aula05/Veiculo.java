package br.univali.turma2601.aula05;

import java.time.Year;

public abstract class Veiculo {

    private static final Integer ANO_MINIMO = 1886;
    private static final Integer ANO_MAXIMO = Year.now().getValue();

    private Integer id;
    private String placa;
    private String marca;
    private String modelo;
    private Integer ano;

    public Veiculo(String placa, String marca, String modelo, Integer ano) {
        setPlaca(placa);
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
    }

    public Integer getId() { return id; }
    public String getPlaca() { return placa; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public Integer getAno() { return ano; }

    public void setId(Integer id) {
        if (this.id == null) {
            this.id = id;
        }
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.trim().isEmpty()) {
            return;
        }
        this.placa = placa.trim();
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            return;
        }
        this.marca = marca.trim();
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            return;
        }
        this.modelo = modelo.trim();
    }

    public void setAno(Integer ano) {
        if (ano == null || ano < ANO_MINIMO || ano > ANO_MAXIMO) {
            return;
        }
        this.ano = ano;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return String.format("[%d] %s | %s %s %d | Placa: %s",
                id, getTipo(), marca, modelo, ano, placa);
    }
}