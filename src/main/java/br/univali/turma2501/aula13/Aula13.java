package br.univali.turma2501.aula13;

import java.io.*;

public class Aula13 {

    public static void main(String[] args) throws IOException {

        //Exemplo de uso de singleton
        ConexaoBancoDados conexao = ConexaoBancoDados.getInstance();

        //Exemplo de uso da strategy
        String inputDoUsuario = "1278587165247682354872356";
        Strategy selectedStrategy = EstrategiasDeBuscaDividas.BARCODE;
        String resultado = new StrategyContext(selectedStrategy, "1234").execute();
        System.out.println(resultado);
    }

}
