package br.univali.turma2601.aula05;

import java.util.ArrayList;
import java.util.List;

public class VeiculoListRepository implements VeiculoRepository {

    private List<Veiculo> veiculos = new ArrayList<>();
    private Integer proximoId = 1;

    @Override
    public void cadastrar(Veiculo veiculo) {
        veiculo.setId(proximoId());
        veiculos.add(veiculo);
    }

    @Override
    public List<Veiculo> listarTodos() {
        return new ArrayList<>(veiculos);
    }

    @Override
    public Veiculo buscarPorId(Integer id) {
        for (Veiculo v : veiculos) {
            if (v.getId().equals(id)) {
                return v;
            }
        }
        return null;
    }

    @Override
    public boolean atualizar(Veiculo veiculo) {
        Veiculo v = buscarPorId(veiculo.getId());
        if (v == null) {
            return false;
        }
        v.setPlaca(veiculo.getPlaca());
        v.setMarca(veiculo.getMarca());
        v.setModelo(veiculo.getModelo());
        v.setAno(veiculo.getAno());
        return true;
    }

    @Override
    public boolean remover(Integer id) {
        Veiculo alvo = buscarPorId(id);
        if (alvo == null) {
            return false;
        }
        veiculos.remove(alvo);
        return true;
    }

    private Integer proximoId() {
        return proximoId++;
    }
}