package br.univali.turma2601.aula15;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class OnlineFotoLoader implements FotoLoader {

    @Override
    public boolean match(String path) {
        if (path == null) {
            return false;
        }
        return path.startsWith("http://") || path.startsWith("https://");
    }

    @Override
    public Foto load(String path) {
        HttpURLConnection connection = null;
        try {
            connection = buildConnection(path);
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                String contentType = connection.getContentType();

                if (contentType == null || !contentType.startsWith("image/")) {
                    return null;
                }

                BufferedInputStream inputStream = new BufferedInputStream(connection.getInputStream());
                BufferedImage bufferedImage = ImageIO.read(inputStream);
                inputStream.close();

                return new Foto(bufferedImage);
            }
        } catch (IOException e) {
            System.err.println("Erro ao buscar imagem: " + e.getMessage());
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        return null;
    }

    private  HttpURLConnection buildConnection(String path) throws IOException {
        URL url = new URL(path);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);
        return connection;
    }

}
