package br.univali.aula13;

import br.univali.aula14.Calculadora;

public class StrategyContext implements Context {

    private Strategy strategy;
    private String input;

    public StrategyContext(Strategy strategy, String input) {
        this.strategy = strategy;
        this.input = input;
    }

    public String execute() {
        return strategy.buscarDividas(this);
    }

    @Override
    public String getUserInput() {
        return input;
    }

    @Override
    public String getSegundoParametro() {
        return "";
    }
}
