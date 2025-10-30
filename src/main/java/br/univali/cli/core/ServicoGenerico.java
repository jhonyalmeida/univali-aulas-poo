package br.univali.cli.core;

import java.util.*;

public abstract class ServicoGenerico<K, T extends Entidade<K>> {

    protected Map<K, T> bancoDados = new HashMap<>();

    public Collection<T> listar() {
        return bancoDados.values();
    }

    public T get(K id) {
        return bancoDados.get(id);
    }

    public void cadastrar(T t) {
        bancoDados.put(t.getId(), t);
    }

    public void excluir(T t) {
        bancoDados.remove(t);
    }

}
