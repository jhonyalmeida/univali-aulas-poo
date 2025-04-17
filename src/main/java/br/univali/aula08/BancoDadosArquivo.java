package br.univali.aula08;

import br.univali.aula04.Tarefa;
import br.univali.aula05.BancoDados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class BancoDadosArquivo implements BancoDados {

    private static final String FILENAME = "tarefas.ser";

    private Map<Integer, Tarefa> tarefas = new HashMap<>();

    public BancoDadosArquivo() {
        init();
    }

    @Override
    public Tarefa get(int id) {
        return tarefas.get(id);
    }

    @Override
    public int salvar(Tarefa tarefa) {
        int id = tarefas.size() + 1;
        tarefas.put(id, tarefa);
        syncToFile();
        return id;
    }

    @SuppressWarnings("unchecked")
    private void init() {
        File file = Paths.get(FILENAME).toFile();
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    syncToFile();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if (file.length() == 0) {
            return;
        }

        try (FileInputStream input = new FileInputStream(file); ObjectInputStream in = new ObjectInputStream(input)) {
            tarefas = (Map<Integer, Tarefa>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void syncToFile() {
        File file = Paths.get(System.getProperty("user.dir"), FILENAME).toFile();
        try (FileOutputStream output = new FileOutputStream(file); ObjectOutputStream out = new ObjectOutputStream(output)) {
            out.writeObject(tarefas);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
