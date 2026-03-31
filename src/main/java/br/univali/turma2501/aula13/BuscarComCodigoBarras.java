package br.univali.turma2501.aula13;

public class BuscarComCodigoBarras implements Strategy {
    @Override
    public String buscarDividas(Context context) {
        return "buscando dividas pelo codigo de barra " + context.getUserInput();
    }
}
