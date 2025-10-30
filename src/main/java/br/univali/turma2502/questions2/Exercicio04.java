package br.univali.turma2502.questions2;

/**

 4) Qual é a saída do programa abaixo?

 a) "Calça" e "CALÇA"
 b) "Camisa" e "Camisa"
 c) "Camisa" e "CAMISA"
 d) "Calça" e "Calça"

 */

public class Exercicio04 {
    public static void main(String[] args) {
        new Exercicio04();
    }

    public Exercicio04() {
        Produto produto = new Produto();
        produto.setNome("Camisa");

        produto = renomear(produto);
        System.out.println(produto.getNome());

        formatar(produto);
        System.out.println(produto.getNome());
    }

    private Produto renomear(Produto produto) {
        Produto produto2 = new Produto();
        produto2.setNome("Calça");
        return produto;
    }

    private void formatar(Produto produto) {
        String nomeFormatado = produto.getNome().toUpperCase();
        produto.setNome(nomeFormatado);
    }

    static class Produto {
        private String nome;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }
}
