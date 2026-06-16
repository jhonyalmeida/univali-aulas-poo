package br.univali.turma2601.aula15;

import java.awt.Image;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class Foto {

    BufferedImage conteudo;

    public Foto(BufferedImage conteudo) {
        this.conteudo = conteudo;
    }

    public Foto redimensionar(int width, int height) {
        double scale = Math.min(
                (double) width / conteudo.getWidth(),
                (double) height / conteudo.getHeight());
        int scaledWidth = (int) (conteudo.getWidth() * scale);
        int scaledHeight = (int) (conteudo.getHeight() * scale);

        BufferedImage resized = new BufferedImage(scaledWidth, scaledHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.drawImage(conteudo, 0, 0, scaledWidth, scaledHeight, null);
        g2d.dispose();

        return new Foto(resized);
    }

    public Foto tonsDeCinza() {
        BufferedImage grayscale = new BufferedImage(conteudo.getWidth(), conteudo.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
        Graphics2D g2d = grayscale.createGraphics();
        g2d.drawImage(conteudo, 0, 0, null);
        g2d.dispose();

        return new Foto(grayscale);
    }

    public Image toImage() {
        return conteudo;
    }

}
