package br.univali.turma2601.aula09;

import java.io.InputStream;
import java.util.Scanner;

public class Console {

    private Scanner scanner;

    public Console(InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
    }

    public String lerString(String msg) {
        System.out.println(msg);
        return scanner.nextLine();
    }

    public Integer lerInteiro() {
        return lerInteiro(null);
    }

    public Integer lerInteiro(String msg) {
        Integer valor = 0;
        while (true) {
            try {
                if (msg != null) {
                    System.out.println(msg);
                }
                valor = Integer.parseInt(scanner.nextLine());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Dado inválido, digite novamente");
            }
        }
    }

    public Double lerDouble(String msg) {
        boolean capturado = false;
        Double valor = 0.0;
        while (!capturado) {
            try {
                System.out.println(msg);
                valor = Double.parseDouble(scanner.nextLine());
                capturado = true;
            } catch (NumberFormatException e) {
                System.out.println("Dado inválido, digite novamente");
            }
        }
        return valor;
    }

}
