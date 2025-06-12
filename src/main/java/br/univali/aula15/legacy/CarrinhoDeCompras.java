package br.univali.aula15.legacy;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Produto> produtos  = new ArrayList<>();
    List<Pagamento> pagamentos = new ArrayList<>();

    public CarrinhoDeCompras() {

    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void adicionarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public void checkout() {
        //enviar pagamento para uma api extenrna
        System.out.println("Compra efetuada com sucesso");
        System.out.println(String.format("Produtos: %s", produtos));
        System.out.println(String.format("Pagamentos: %s", pagamentos));
    }

    public void limpar() {
        System.out.println("Carrinho limpo para próxima compra");
    }

}
