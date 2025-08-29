package br.univali.turma2501.aula13;

public class BuscarComReferencia implements Strategy {
    @Override
    public String buscarDividas(Context context) {
        return "buscando dividas pela referencia + " + context.getUserInput();
    }
}
