package br.univali.turma2601.aula13;

public class Main {

    public static void main(String[] args) {
        ConexaoBanco conexaoBanco = ConexaoBanco.getInstance();
        ConexaoBanco conexaoBanco2 = ConexaoBanco.getInstance();
        System.out.println(conexaoBanco == conexaoBanco2);
    }

}
