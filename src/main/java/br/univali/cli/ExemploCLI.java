package br.univali.cli;

import java.util.Scanner;

public class ExemploCLI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        System.out.println("O dobro do número é " + (numero * 2));
    }

}
