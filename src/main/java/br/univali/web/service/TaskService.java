package br.univali.web.service;

import br.univali.web.model.Produto;
import java.util.List;
import java.util.Optional;

public interface TaskService {

    List<Produto> listarProdutos();

    Optional<Produto> buscarPorId(Long id);

    void criarProduto(Produto produto);

    void atualizarProduto(Produto produto);

}
