package br.univali.turma2501.aula13;

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
