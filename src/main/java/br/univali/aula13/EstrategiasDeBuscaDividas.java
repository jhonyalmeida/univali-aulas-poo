package br.univali.aula13;

public enum EstrategiasDeBuscaDividas implements Strategy {
    BARCODE {
        @Override
        public String buscarDividas(Context context) {
            return new BuscarComBarcode().buscarDividas(context);
        }
    },
    REFERENCE{
        @Override
        public String buscarDividas(Context context) {
            return new BuscarComReferencia().buscarDividas(context);
        }
    };

    abstract public String buscarDividas(Context context);
}
