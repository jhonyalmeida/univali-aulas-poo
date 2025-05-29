package br.univali.aula13;

public class BuscarComBarcode implements Strategy {
    @Override
    public String buscarDividas(String input) {
        return "buscando dividas pelo codigo de barra...";
    }
}
