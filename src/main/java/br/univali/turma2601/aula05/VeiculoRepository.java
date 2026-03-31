package br.univali.turma2601.aula05;

import java.util.List;

public interface VeiculoRepository {

    void cadastrar(Veiculo veiculo);

    List<Veiculo> listarTodos();

    Veiculo buscarPorId(Integer id);

    boolean atualizar(Veiculo veiculo);

    boolean remover(Integer id);

}