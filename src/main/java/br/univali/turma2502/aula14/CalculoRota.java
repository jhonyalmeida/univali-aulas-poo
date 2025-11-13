package br.univali.turma2502.aula14;

public enum CalculoRota implements CalculoRotaStrategy {
    A_PE {
        @Override
        public Rota calcularRota(Ponto p1, Ponto p2) {
            return new CalculoAPe(p1, p2).calcularRota();
        }
    },
    CARRO {
        @Override
        public Rota calcularRota(Ponto p1, Ponto p2) {
            return new Rota();
        }
    },
    TRANSPORTE_PUBLICO {
        @Override
        public Rota calcularRota(Ponto p1, Ponto p2) {
            return new Rota();
        }
    },
    SUBMARINO {
        @Override
        public Rota calcularRota(Ponto p1, Ponto p2) {
            return new Rota();
        }
    };

}
