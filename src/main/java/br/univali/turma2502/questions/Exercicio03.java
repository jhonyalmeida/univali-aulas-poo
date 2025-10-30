package br.univali.turma2502.questions;

/**

 3) Qual é a saída do programa abaixo?

 a) "Código de pessoa"
 b) "Código de funcionário"
 c) O código não compila
 d) Uma RuntimeException é lançada ao executar o programa

 */

public class Exercicio03 {
    public static void main(String[] args) {
        new Exercicio03();
    }

    public Exercicio03() {
        Pessoa pessoa = new Funcionario(null);
        String codigo = pessoa.getCodigo();
        System.out.println(codigo);
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
