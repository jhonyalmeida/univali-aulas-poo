package br.univali.turma2601.aula13;

public class ConexaoBanco {

    private static ConexaoBanco INSTANCE;

    private ConexaoBanco(String url) {
        System.out.println("Conectando com o banco: " + url);
    }

    public static ConexaoBanco getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ConexaoBanco("http://meubanco");
        }
        return INSTANCE;
    }
}
