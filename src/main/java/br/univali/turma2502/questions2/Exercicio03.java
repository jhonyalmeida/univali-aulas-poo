package br.univali.turma2502.questions2;

/**

 3) Qual é a saída do programa abaixo?

 a) "Código de pessoa: 0000"
 b) "Código de funcionário: 0000"
 c) O código não compila
 d) "Código de funcionário: null"

 */

public class Exercicio03 {
    public static void main(String[] args) {
        new Exercicio03();
    }

    public Exercicio03() {
        Pessoa pessoa = new Funcionario();
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
        public Funcionario() {
            this("0000");
        }

        public Funcionario(String codigo) {
            super(codigo);
        }

        String getCodigo() {
            return "Código de funcionário: " + codigo;
        }
    }
}
