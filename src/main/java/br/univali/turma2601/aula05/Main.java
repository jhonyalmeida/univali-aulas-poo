package br.univali.turma2601.aula05;

public class Main {

    public static void main(String[] args) {
        GaragemApp app = new GaragemApp(new VeiculoListRepository(), new Console());
        app.executar();
    }
}