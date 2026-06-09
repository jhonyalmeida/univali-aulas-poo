package br.univali.turma2601.threads;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VisualizadorCorrida implements Runnable {

    private static final int INTERVALO_MS = 100;
    private static final int LARGURA_JANELA = 700;
    private static final int MARGEM = 20;
    private static final int LARGURA_NOME = 90;
    private static final int ALTURA_BARRA = 35;
    private static final int ESPACO_ENTRE = 15;

    private static final Map<String, Color> CORES;

    static {
        CORES = new HashMap<>();
        CORES.put("blue",   new Color(30,  100, 220));
        CORES.put("green",  new Color(30,  160, 60));
        CORES.put("red",    new Color(210, 40,  40));
        CORES.put("yellow", new Color(200, 170, 0));
    }

    private final List<Cavalo> cavalos;
    private volatile boolean rodando = true;
    private JPanel painel;

    public VisualizadorCorrida(List<Cavalo> cavalos) {
        this.cavalos = cavalos;
    }

    public void parar() {
        rodando = false;
    }

    @Override
    public void run() {
        try {
            SwingUtilities.invokeAndWait(this::criarJanela);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        while (rodando) {
            SwingUtilities.invokeLater(() -> painel.repaint());
            try {
                Thread.sleep(INTERVALO_MS);
            } catch (InterruptedException e) {
                break;
            }
        }

        SwingUtilities.invokeLater(() -> painel.repaint());
    }

    private void criarJanela() {
        int alturaJanela = MARGEM * 2 + 40 + cavalos.size() * (ALTURA_BARRA + ESPACO_ENTRE);

        painel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                desenhar(g);
            }
        };
        painel.setBackground(new Color(30, 30, 30));
        painel.setPreferredSize(new Dimension(LARGURA_JANELA, alturaJanela));

        JFrame frame = new JFrame("Corrida de Cavalos");
        frame.add(painel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void desenhar(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        int larguraPista = painel.getWidth() - MARGEM * 2 - LARGURA_NOME - 70;

        g2.setFont(new Font("Monospaced", Font.BOLD, 18));
        g2.setColor(Color.WHITE);
        g2.drawString("CORRIDA DE CAVALOS", MARGEM, MARGEM + 20);

        for (int i = 0; i < cavalos.size(); i++) {
            Cavalo cavalo = cavalos.get(i);
            int y = MARGEM + 40 + i * (ALTURA_BARRA + ESPACO_ENTRE);
            Color cor = CORES.getOrDefault(cavalo.getCor().toLowerCase(), Color.GRAY);

            g2.setFont(new Font("Monospaced", Font.BOLD, 14));
            g2.setColor(cor);
            g2.drawString(cavalo.getNome(), MARGEM, y + ALTURA_BARRA / 2 + 5);

            int xPista = MARGEM + LARGURA_NOME;

            g2.setColor(new Color(60, 60, 60));
            g2.fillRoundRect(xPista, y, larguraPista, ALTURA_BARRA, 10, 10);

            int percorrido = Math.min(cavalo.getDistanciaPercorrida(), cavalo.getDistanciaPista());
            int larguraBarra = (int) ((double) percorrido / cavalo.getDistanciaPista() * larguraPista);
            if (larguraBarra > 0) {
                g2.setColor(cor);
                g2.fillRoundRect(xPista, y, larguraBarra, ALTURA_BARRA, 10, 10);
            }

            g2.setFont(new Font("Monospaced", Font.BOLD, 12));
            g2.setColor(Color.WHITE);
            String status = cavalo.isTerminou() ? "CHEGOU!" : percorrido + "m";
            g2.drawString(status, xPista + larguraPista + 8, y + ALTURA_BARRA / 2 + 5);
        }
    }
}
