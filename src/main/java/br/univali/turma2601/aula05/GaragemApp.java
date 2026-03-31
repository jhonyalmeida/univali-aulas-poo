package br.univali.turma2601.aula05;

import java.util.List;

public class GaragemApp {

    private final VeiculoRepository garagem;
    private final Console console;

    public GaragemApp(VeiculoRepository garagem, Console console) {
        this.garagem = garagem;
        this.console = console;
    }

    public void executar() {
        int opcao;
        do {
            exibirMenu();
            opcao = console.lerInt("Opção: ");
            if (opcao == 1) cadastrar();
            else if (opcao == 2) listar();
            else if (opcao == 3) buscar();
            else if (opcao == 4) atualizar();
            else if (opcao == 5) remover();
            else if (opcao == 0) System.out.println("Saindo...");
            else System.out.println("Opção inválida.");
        } while (opcao != 0);
    }

    private void exibirMenu() {
        System.out.println("\n=== GARAGEM - CRUD DE VEÍCULOS ===");
        System.out.println("1. Cadastrar veículo");
        System.out.println("2. Listar todos");
        System.out.println("3. Buscar por ID");
        System.out.println("4. Atualizar veículo");
        System.out.println("5. Remover veículo");
        System.out.println("0. Sair");
    }

    private void cadastrar() {
        System.out.println("\n--- Tipo de veículo ---");
        System.out.println("1. Carro");
        System.out.println("2. Motocicleta");
        System.out.println("3. Caminhonete");
        int tipo = console.lerInt("Tipo: ");

        String placa = console.lerString("Placa: ");
        String marca = console.lerString("Marca: ");
        String modelo = console.lerString("Modelo: ");
        Integer ano = console.lerInt("Ano: ");

        Veiculo veiculo;
        if (tipo == 1) {
            Integer portas = console.lerInt("Número de portas: ");
            veiculo = new Carro(placa, marca, modelo, ano, portas);
        } else if (tipo == 2) {
            Integer cc = console.lerInt("Cilindradas (cc): ");
            veiculo = new Motocicleta(placa, marca, modelo, ano, cc);
        } else if (tipo == 3) {
            Double carga = console.lerDouble("Capacidade de carga (ton): ");
            veiculo = new Caminhonete(placa, marca, modelo, ano, carga);
        } else {
            System.out.println("Tipo inválido. Cadastro cancelado.");
            return;
        }

        garagem.cadastrar(veiculo);
        System.out.println("Veículo cadastrado: " + veiculo);
    }

    private void listar() {
        List<Veiculo> lista = garagem.listarTodos();
        if (lista.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }
        System.out.println("\n--- Veículos cadastrados ---");
        for (Veiculo v : lista) {
            System.out.println(v);
        }
    }

    private void buscar() {
        int id = console.lerInt("ID do veículo: ");
        Veiculo resultado = garagem.buscarPorId(id);
        if (resultado != null) {
            System.out.println("Encontrado: " + resultado);
        } else {
            System.out.println("Veículo não encontrado.");
        }
    }

    private void atualizar() {
        int id = console.lerInt("ID do veículo a atualizar: ");
        Veiculo veiculo = garagem.buscarPorId(id);

        if (veiculo == null) {
            System.out.println("Veículo não encontrado.");
            return;
        }

        System.out.println("Atual: " + veiculo);
        System.out.println("(Pressione Enter para manter o valor atual)");

        String placa  = console.lerStringOpcional("Nova placa  [" + veiculo.getPlaca()  + "]: ", veiculo.getPlaca());
        String marca  = console.lerStringOpcional("Nova marca  [" + veiculo.getMarca()  + "]: ", veiculo.getMarca());
        String modelo = console.lerStringOpcional("Novo modelo [" + veiculo.getModelo() + "]: ", veiculo.getModelo());
        String anoStr = console.lerStringOpcional("Novo ano    [" + veiculo.getAno()    + "]: ", String.valueOf(veiculo.getAno()));
        Integer ano = Integer.parseInt(anoStr);

        veiculo.setPlaca(placa);
        veiculo.setMarca(marca);
        veiculo.setModelo(modelo);
        veiculo.setAno(ano);

        garagem.atualizar(veiculo);
        System.out.println("Veículo atualizado: " + garagem.buscarPorId(id));
    }

    private void remover() {
        int id = console.lerInt("ID do veículo a remover: ");
        if (garagem.remover(id)) {
            System.out.println("Veículo removido com sucesso.");
        } else {
            System.out.println("Veículo não encontrado.");
        }
    }
}