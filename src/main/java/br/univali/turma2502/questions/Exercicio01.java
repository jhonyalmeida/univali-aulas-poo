package br.univali.turma2502.questions;

/**
 1) Qual é a saída do programa abaixo?

 a) "Código de funcionário: 007"
 b) "Código de pessoa: 007"
 c) "Código de pessoa: "
 d) Uma RuntimeException é lançada ao executar o programa

 */

public class Exercicio01 {

    public static void main(String[] args) {
        new Exercicio01();
    }

    public Exercicio01() {
        Pessoa pessoa = new Funcionario("007");
        String nome = pessoa.getCodigo();
        System.out.println(nome);
    }

    static class Pessoa {
        protected String codigo;

        public Pessoa(String codigo) {
            this.codigo = codigo;
        }

        String getCodigo() {
            return "Código de pessoa: " + codigo;
        }
    }

    static class Funcionario extends Pessoa {
        public Funcionario(String codigo) {
            super(codigo);
        }

        String getCodigo() {
            return "Código de funcionário: " + codigo;
        }
    }

}
