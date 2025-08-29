package br.univali.turma2501.aula15;

import br.univali.turma2501.aula15.legacy.CarrinhoDeCompras;
import br.univali.turma2501.aula15.legacy.Pagamento;
import br.univali.turma2501.aula15.legacy.Produto;

import java.util.List;

public class ComprasFacade {

    public void efetuarCompra(Compra compra) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        for (Produto produto : compra.produtos) {
            carrinhoDeCompras.adicionarProduto(produto);
        }
        for (Pagamento pagamento : compra.pagamentos) {
            carrinhoDeCompras.adicionarPagamento(pagamento);
        }
        carrinhoDeCompras.checkout();
        carrinhoDeCompras.limpar();
        //enviar notificação de nova compra para tópico de eventos
    }

    public static class Compra {
        List<Produto> produtos;
        List<Pagamento> pagamentos;

        public Compra(List<Produto> produtos, List<Pagamento> pagamentos) {
            this.produtos = produtos;
            this.pagamentos = pagamentos;
        }
    }

}
