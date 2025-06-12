package br.univali.aula15;

import br.univali.aula15.legacy.MeioPagamento;
import br.univali.aula15.legacy.Pagamento;
import br.univali.aula15.legacy.Produto;

import java.util.ArrayList;
import java.util.List;

import static br.univali.aula15.ComprasFacade.Compra;

public class Main {

    public static void main(String[] args) {
        // Inicializar objetos de produtos e pagamentos
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("IPhone 15 Pro Max", 1200.0));
        produtos.add(new Produto("Coca-cola Lata 350ML", 20.0));
        List<Pagamento> pagamentos = new ArrayList<>();
        pagamentos.add(new Pagamento(MeioPagamento.PIX, 1220.0));


        // Uso do facade
        Compra compra = new Compra(produtos, pagamentos);
        ComprasFacade facade = new ComprasFacade();
        facade.efetuarCompra(compra);
    }

}
