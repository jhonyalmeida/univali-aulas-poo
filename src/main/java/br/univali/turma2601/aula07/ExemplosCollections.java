package br.univali.turma2601.aula07;

import java.util.*;

public class ExemplosCollections {

    public static void main(String[] args) {
        exemploMap(); //trocar para executar outro exemplo
    }

    public static void exemploMap() {
        Map<String, Funcionario> funcionarios = new TreeMap<>(); // trocar por HashMap ou LinkedHashMap
        funcionarios.put("Joao", new Funcionario("Joao", "Dev Sr"));
        funcionarios.put("Maria", new Funcionario("Maria", "Tech Lead"));
        funcionarios.put("Samara", new Funcionario("Samara", "Dev Pleno"));
        funcionarios.put("Horacio", new Funcionario("Horacio", "Dev Jr"));
        for (Funcionario funcionario : funcionarios.values()) {
            System.out.println(funcionario.getCargo());
        }
    }

    public static void exemploSet() {
        Set<Integer> numeros = new TreeSet<>(); //trocar por HashSet ou LinkedHashSet
        numeros.add(4);
        numeros.add(5);
        numeros.add(71);
        numeros.add(5);
        numeros.add(2);
        numeros.add(34);
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }

    public static void exemploList() {
        List<String> nomes = new LinkedList<>(); //trocar por ArrayList
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Horacio");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

}
