package br.univali.web.service;

import br.univali.web.model.Produto;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class TaskServiceImpl implements TaskService {

    @Override
    public List<Produto> listarProdutos() {
        return Collections.emptyList();
    }

    @Override
    public Optional<Produto> buscarPorId(Long id) {
        return Optional.empty();
    }

    @Override
    public void criarProduto(Produto produto) {

    }

    @Override
    public void atualizarProduto(Produto produto) {

    }

}
