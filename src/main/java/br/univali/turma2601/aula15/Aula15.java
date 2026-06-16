package br.univali.turma2601.aula15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula15 {

    /**
     * Código em forma de script.
     *
     * Desafio: refatorar código para formato orientado a objetos. Atenção ao princípio de responsabilidades por classe.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter image URL (JPEG): ");
        String imageUrl = scanner.nextLine();
        scanner.close();

        List<FotoLoader> fotoLoaders = new ArrayList<>();
        fotoLoaders.add(new OnlineFotoLoader());
        fotoLoaders.add(new FileFotoLoader());

        FotoLoader fotoLoader = null;
        for (FotoLoader f : fotoLoaders) {
            if (f.match(imageUrl)) {
                fotoLoader = f;
            }
        }

        if (fotoLoader == null) {
            System.out.println("Path de imagem inválido");
            return;
        }

        Foto tonsDeCinza = fotoLoader.load(imageUrl)
                .redimensionar(800, 600)
                .tonsDeCinza();

        JanelaFoto janelaFoto = new JanelaFoto(tonsDeCinza);
        janelaFoto.exibir();
    }

}
