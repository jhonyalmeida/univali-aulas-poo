package br.univali.turma2601.aula15;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileFotoLoader implements FotoLoader {

    @Override
    public boolean match(String path) {
        if (path == null) {
            return false;
        }
        return !path.startsWith("http://") && !path.startsWith("https://");
    }

    @Override
    public Foto load(String path) {
        try {
            BufferedImage bufferedImage = ImageIO.read(Files.newInputStream(Paths.get(path)));
            return new Foto(bufferedImage);
        } catch (IOException e) {
            System.err.println("Erro ao buscar imagem: " + e.getMessage());
        }
        return null;
    }

}
