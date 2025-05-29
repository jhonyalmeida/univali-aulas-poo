package br.univali.aula13;

import java.io.*;

public class Aula13 {

    public static void main(String[] args) throws IOException {

        //Exemplo de uso de singleton
        ConexaoBancoDados conexao = ConexaoBancoDados.getInstance();

        //Exemplo de uso da strategy
        String inputDoUsuario = "1278587165247682354872356";
        Strategy selectedStrategy = EstrategiasDeBuscaDividas.REFERENCE;
        String resultado = selectedStrategy.buscarDividas(inputDoUsuario);
        System.out.println(resultado);

        Pessoa pessoa = new Pessoa("nome");
        PessoaFacade pessoaFacade = new SistemaLegado();
        pessoaFacade.createPessoa(pessoa);

        //Exemplo de adapter no Java
        OutputStream outputStream = new ByteArrayOutputStream();
        outputStream.write("meu texto aqui".getBytes());
        Writer writer = new OutputStreamWriter(outputStream);
        writer.write("meu texto aqui");
    }

}
