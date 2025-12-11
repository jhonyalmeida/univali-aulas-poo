package br.univali.turma2502.aula18.exercicio;

// Classe com as regras de desconto e acréscimo de preço
public class CalculadoraPreco {
    public double calcular(double preco, String meioPagamento, int parcelas) {
        if (meioPagamento.equals("PIX")) {
            return preco * 0.95; // 5% de desconto
        } else if (meioPagamento.equals("CARTAO_CREDITO")) {
            if (parcelas == 1) {
                return preco; // Preço original
            } else {
                return preco * (1 + 0.02 * (parcelas - 1)); // Acréscimo de 2% por parcela extra
            }
        } else {
            throw new IllegalArgumentException("Meio de pagamento inválido");
        }
    }
}
