package br.univali.turma2601.aula05;

import java.util.Scanner;

public class Console {

    private final Scanner scanner = new Scanner(System.in);

    public Integer lerInt(String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(scanner.nextLine());
    }

    public Double lerDouble(String prompt) {
        System.out.print(prompt);
        return Double.parseDouble(scanner.nextLine());
    }

    public String lerString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public String lerStringOpcional(String prompt, String padrao) {
        System.out.print(prompt);
        String valor = scanner.nextLine();
        return valor.isEmpty() ? padrao : valor;
    }
}