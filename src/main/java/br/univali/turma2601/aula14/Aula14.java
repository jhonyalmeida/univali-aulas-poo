package br.univali.turma2601.aula14;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Aula14 {

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

        URL url = new URL(imageUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);

        int responseCode = connection.getResponseCode();
        System.out.println("Response code: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) {
            String contentType = connection.getContentType();
            if (contentType == null || !contentType.startsWith("image/")) {
                System.out.println("Error: URL does not point to an image (Content-Type: " + contentType + ")");
                System.out.println("Make sure the URL is a direct link to the image file, not a web page.");
                connection.disconnect();
                return;
            }

            BufferedInputStream inputStream = new BufferedInputStream(connection.getInputStream());
            BufferedImage original = ImageIO.read(inputStream);
            inputStream.close();

            if (original == null) {
                System.out.println("Error: could not decode image. Format may not be supported.");
                connection.disconnect();
                return;
            }

            int windowWidth = 800;
            int windowHeight = 600;
            double scale = Math.min(
                    (double) windowWidth / original.getWidth(),
                    (double) windowHeight / original.getHeight());
            int scaledWidth = (int) (original.getWidth() * scale);
            int scaledHeight = (int) (original.getHeight() * scale);

            BufferedImage grayscale = new BufferedImage(scaledWidth, scaledHeight, BufferedImage.TYPE_BYTE_GRAY);
            Graphics2D g2d = grayscale.createGraphics();
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2d.drawImage(original, 0, 0, scaledWidth, scaledHeight, null);
            g2d.dispose();

            JFrame frame = new JFrame("Grayscale Image");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new JLabel(new ImageIcon(grayscale)));
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        } else {
            System.out.println("Request failed with code: " + responseCode);
        }

        connection.disconnect();
    }

}
