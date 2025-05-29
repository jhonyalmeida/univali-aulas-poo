package br.univali.aula13;

public enum EstrategiasDeBuscaDividas implements Strategy {
    BARCODE {
        @Override
        public String buscarDividas(String input) {
            return new BuscarComBarcode().buscarDividas(input);
        }
    },
    REFERENCE{
        @Override
        public String buscarDividas(String input) {
            return new BuscarComReferencia().buscarDividas(input);
        }
    };

    abstract public String buscarDividas(String input);
}
