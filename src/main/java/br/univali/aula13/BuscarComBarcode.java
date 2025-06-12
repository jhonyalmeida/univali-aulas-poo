package br.univali.aula13;

public class BuscarComBarcode implements Strategy {
    @Override
    public String buscarDividas(Context context) {
        return "buscando dividas pelo codigo de barra " + context.getUserInput();
    }
}
