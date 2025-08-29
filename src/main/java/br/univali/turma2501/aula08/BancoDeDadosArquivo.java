package br.univali.turma2501.aula08;

import br.univali.turma2501.aula04.Tarefa;
import br.univali.turma2501.aula05.BancoDados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class BancoDeDadosArquivo implements BancoDados {

    private static final String FILENAME = "tarefas.ser";

    private Map<Integer, Tarefa> tarefas = new HashMap<>();

    public BancoDeDadosArquivo() {
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

    private void init() {
        File file = Paths.get(FILENAME).toFile();
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    syncToFile();
                }
                System.out.println("Salvo com sucesso!");
            } catch (IOException e) {
                throw new ConexaoException(e, "Erro ao criar o arquivo");
            } finally {
                System.out.println("Sempre executa isso");
            }
        }

        if (file.length() == 0) {
            return;
        }

        try (FileInputStream input = new FileInputStream(file);
             ObjectInputStream in = new ObjectInputStream(input)) {
            tarefas = (Map<Integer, Tarefa>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new ConexaoException(e, "Erro ao ler o arquivo");
        }
    }

    private void syncToFile() {
        File file = Paths.get(System.getProperty("user.dir"), FILENAME).toFile();
        try (FileOutputStream fileOutput = new FileOutputStream(file);
             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
            objectOutput.writeObject(tarefas);
        } catch (IOException e) {
            throw new ConexaoException(e, "Erro ao atualizar o arquivo");
        }
    }

}
