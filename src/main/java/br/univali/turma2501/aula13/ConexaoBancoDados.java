package br.univali.turma2501.aula13;

public class ConexaoBancoDados {

    private static final ConexaoBancoDados instance = new ConexaoBancoDados();

    private ConexaoBancoDados() {
        //estabelecer conexao
    }

    public static ConexaoBancoDados getInstance() {
        return instance;
    }

}
